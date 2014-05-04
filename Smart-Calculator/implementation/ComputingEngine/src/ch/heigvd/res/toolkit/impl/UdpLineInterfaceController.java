package ch.heigvd.res.toolkit.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import ch.heigvd.res.toolkit.computingEngine_server.ComputingEngProtocol;

public class UdpLineInterfaceController extends AbstractInterfaceController {

	final static Logger LOG = Logger.getLogger(TcpLineInterfaceController.class
			.getName());

	int port;

	boolean shouldRun = true;

	MulticastSocket mcSocket;

	private final Map<Long, DynamicDiscoveryWorker> dynamicDiscoveryWorker = new HashMap<>();

	/**
	 * This class implements the method that runs on the "listen" thread and is
	 * responsible for accepting connection requests from clients.
	 */
	private class ListenWorker implements Runnable {
		@Override
		public void run() {

			try {

				mcSocket = new MulticastSocket(
						ComputingEngProtocol.DEFAULT_UDP_PORT);

				mcSocket.joinGroup(InetAddress
						.getByName(ComputingEngProtocol.PROTOCOL_MULTICAST_ADDRESS));

				System.out.println("Computing Engine listening multicast: "
						+ ComputingEngProtocol.PROTOCOL_MULTICAST_ADDRESS
						+ " over UDP port "
						+ ComputingEngProtocol.DEFAULT_UDP_PORT);
				new Thread(new DynamicDiscoveryWorker()).start();

			} catch (UnknownHostException u) {
				// TODO Auto-generated catch block
				u.printStackTrace();
				System.exit(0);
			} catch (IOException ioE) {
				// TODO Auto-generated catch block
				ioE.printStackTrace();
				System.exit(0);
			}

		}
	}

	/**
	 * This class is responsible for managing a client connection. It provides a
	 * method that executes on its own thread. The class exposes two methods
	 * that are invoked via the IContext and the IInterfaceController
	 * interfaces: 1) sendMessage and 2) closeConnection.
	 */
	private class DynamicDiscoveryWorker implements Runnable {

		private DatagramSocket dSocket;
		private final long sessionId;

		private byte[] buf;
		private DatagramPacket udpPacket;
		private String msgString;

		private InetAddress destIP;

		public DynamicDiscoveryWorker() throws IOException {

			buf = new byte[ComputingEngProtocol.BUFFER_SIZE];
			udpPacket = new DatagramPacket(buf, buf.length);

			Session newSession = createSession();
			sessionId = newSession.getSessionId();
			UdpLineInterfaceController.this.dynamicDiscoveryWorker.put(
					sessionId, this);
			startSession(sessionId);
		}

		@Override
		public void run() {

			try {

				mcSocket.receive(udpPacket);
				destIP = udpPacket.getAddress();
				msgString = new String(udpPacket.getData(),
						udpPacket.getOffset(), udpPacket.getLength());

				Message msg = getProtocolHandler().getProtocolSerializer()
						.deserialize(msgString.getBytes());

				System.out.println("ComputingEngine has received:");
				System.out.println(msgString);
				System.out.println(msg.getType());

				UdpLineInterfaceController.this.onMessage(sessionId, msg);
			} catch (InvalidMessageException e) {
				UdpLineInterfaceController.this.onInvalidMessage(sessionId,
						e);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			UdpLineInterfaceController.this.closeSession(sessionId);
		}

		/**
		 * Used to send raw data back to the connected client
		 * 
		 * @param data
		 *            the wire-level data, obtained after serializing an
		 *            application-level message
		 */
		public void send(String data) {
			DatagramSocket dsocket;
			try {
				dsocket = new DatagramSocket(
						ComputingEngProtocol.DEFAULT_UDP_RESPONSE_PORT, destIP);

				udpPacket.setData(data.getBytes());

				dsocket.send(udpPacket);
			} catch (SocketException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		/**
		 * Used to close the UDP multicast listening socket
		 */
		public void closeConnection() {

			mcSocket.close();

		}

	}

	public UdpLineInterfaceController(int port) {
		this.port = port;
	}

	@Override
	public void startup() {
		new Thread(new ListenWorker()).start();
	}

	@Override
	public void sendMessage(long sessionId, Message message) {
		// Retrieve the worker who is taking care of the session and connected
		// with the client
		DynamicDiscoveryWorker worker = dynamicDiscoveryWorker.get(sessionId);

		if (worker == null) {
			LOG.severe("Could not find worker for session " + sessionId);
		}

		// Serialize the message into wire-level data
		byte[] data = getProtocolHandler().getProtocolSerializer().serialize(
				message);

		// Send the wire-level data
		worker.send(new String(data));
	}

	@Override
	public void closeSession(long sessionId) {
		super.closeSession(sessionId);

		// Retrieve the worker who is taking care of the session and connected
		// with the client
		DynamicDiscoveryWorker worker = dynamicDiscoveryWorker.get(sessionId);

		// Ask the worker to close the connection
		worker.closeConnection();
	}

}
