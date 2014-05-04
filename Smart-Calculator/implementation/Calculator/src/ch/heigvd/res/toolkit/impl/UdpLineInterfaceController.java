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


import ch.heigvd.res.toolkit.smartCalc_client.SmartCalcProtocol;

/**
 * This class implements a specific interface controller, which 1) uses TCP as
 * an underlying transport protocol and 2) uses a simple line-by-line message
 * demarcation method.
 * 
 * In other words, the server reads the data sent by the client and considers
 * that each line contains data that can be transformed into one
 * application-level message.
 * 
 * The interface controller is multi-threaded. One thread is used to accept
 * connection requests, one more thread is used for each connected client.
 * 
 * @author Olivier Liechti
 */
public class UdpLineInterfaceController extends AbstractInterfaceController {

	final static Logger LOG = Logger.getLogger(UdpLineInterfaceController.class
			.getName());

	int port;

	boolean shouldRun = true;

	private DatagramSocket dSocket;

	private final Map<Long, ClientWorker> clientWorkers = new HashMap<>();

	/**
	 * This class implements the method that runs on the "listen" thread and is
	 * responsible for accepting connection requests from clients.
	 */
	private class ListenWorker implements Runnable {
		@Override
		public void run() {

			try {

				dSocket = new DatagramSocket();


				System.out.println("SmartCalculator started : "
						+ SmartCalcProtocol.PROTOCOL_MULTICAST_ADDRESS
						+ " over UDP port "
						+ SmartCalcProtocol.DEFAULT_UDP_PORT);
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

	private class DynamicDiscoveryWorker implements Runnable {


		private byte[] buf;
		private DatagramPacket udpPacket;
		private String msg;

		public DynamicDiscoveryWorker()
				throws IOException {


			buf = new byte[SmartCalcProtocol.BUFFER_SIZE];
			udpPacket = new DatagramPacket(buf, buf.length,InetAddress.getByName(SmartCalcProtocol.PROTOCOL_MULTICAST_ADDRESS),SmartCalcProtocol.DEFAULT_UDP_PORT);

		}

		@Override
		public void run() {

			System.out.println("Client multicasting HELLO");
			Message hello = new Message(
					SmartCalcProtocol.MessageType.MSG_HELLO);

			hello.setAttribute("command", SmartCalcProtocol.MessageType.MSG_HELLO);

			udpPacket.setData(getProtocolHandler().getProtocolSerializer()
					.serialize(hello));
			
			try {
				dSocket.send(udpPacket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			DatagramPacket respPacket = new DatagramPacket(buf, buf.length);
			try {
				dSocket.receive(respPacket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Message response = getProtocolHandler().getProtocolSerializer().deserialize(respPacket.getData());
				System.out.println(response);
			} catch (InvalidMessageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			while (true) {
//				try {
//					
//					
//					mcSocket.receive(udpPacket);
//					msg = new String(udpPacket.getData(),
//							udpPacket.getOffset(), udpPacket.getLength());
//
//					Message msgHello = getProtocolHandler()
//							.getProtocolSerializer()
//							.deserialize(msg.getBytes());
//
//					System.out.println("ComputingEngine has received:");
//					System.out.println(msg);
//					System.out.println(msgHello.getType());
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvalidMessageException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		}

//		public void sendHereIAm(InetAddress dstIP) throws SocketException {
//			DatagramSocket dsocket = new DatagramSocket(
//					ComputingEngProtocol.DEFAULT_UDP_RESPONSE_PORT, dstIP);
//
//			Message hereIAm = new Message(
//					ComputingEngProtocol.MessageType.MSG_HERE_I_AM);
//
//			hereIAm.setAttribute("command", ComputingEngProtocol.MSG_HERE_I_AM);
//			hereIAm.setAttribute("arguments",
//					ComputingEngProtocol.DEFAULT_TCP_PORT);
//			hereIAm.setAttribute("arguments",
//					ComputingEngProtocol.PROTOCOL_COMPUTING_ENGINE_IP);
//			udpPacket.setData(getProtocolHandler().getProtocolSerializer()
//					.serialize(hereIAm));
//
//			try {
//
//				dsocket.send(udpPacket);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

	/**
	 * This class is responsible for managing a client connection. It provides a
	 * method that executes on its own thread. The class exposes two methods
	 * that are invoked via the IContext and the IInterfaceController
	 * interfaces: 1) sendMessage and 2) closeConnection.
	 */
	private class ClientWorker implements Runnable {

		private final Socket socket;
		private final BufferedReader in;
		private final PrintWriter out;
		private final long sessionId;

		public ClientWorker(Socket socket) throws IOException {
			this.socket = socket;
			in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			out = new PrintWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			Session newSession = createSession();
			sessionId = newSession.getSessionId();
			UdpLineInterfaceController.this.clientWorkers.put(sessionId, this);
			startSession(sessionId);
		}

		@Override
		public void run() {
			String line;
			try {
				while ((line = in.readLine()) != null) {
					try {
						Message msg = getProtocolHandler()
								.getProtocolSerializer().deserialize(
										line.getBytes());
						UdpLineInterfaceController.this.onMessage(sessionId,
								msg);
					} catch (InvalidMessageException e) {
						UdpLineInterfaceController.this.onInvalidMessage(
								sessionId, e);
					}
				}
				UdpLineInterfaceController.this.closeSession(sessionId);
			} catch (IOException ex) {
				Logger.getLogger(UdpLineInterfaceController.class.getName())
						.log(Level.SEVERE, ex.getMessage(), ex);
			}
		}

		/**
		 * Used to send raw data back to the connected client
		 * 
		 * @param data
		 *            the wire-level data, obtained after serializing an
		 *            application-level message
		 */
		public void send(String data) {
			LOG.log(Level.INFO,
					"Sending wire-level data over TCP (session:{0}) : {1}",
					new Object[] { sessionId, data });
			out.println(data);
			out.flush();
		}

		/**
		 * Used to close the TCP connection
		 */
		public void closeConnection() {
			LOG.log(Level.INFO, "Closing TCP connection (session:{0})",
					sessionId);
			out.flush();
			try {
				socket.close();
			} catch (IOException ex) {
				Logger.getLogger(UdpLineInterfaceController.class.getName())
						.log(Level.SEVERE, ex.getMessage(), ex);
			}
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
		ClientWorker worker = clientWorkers.get(sessionId);

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
		ClientWorker worker = clientWorkers.get(sessionId);

		// Ask the worker to close the connection
		worker.closeConnection();
	}

}
