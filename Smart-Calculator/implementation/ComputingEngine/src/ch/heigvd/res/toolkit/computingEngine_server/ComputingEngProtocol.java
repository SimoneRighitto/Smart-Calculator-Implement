package ch.heigvd.res.toolkit.computingEngine_server;

import ch.heigvd.res.toolkit.interfaces.IMessageType;
import ch.heigvd.res.toolkit.interfaces.IState;

/**
 * This class is used to define constants and enum types specific to the
 * Distributed Computing Protocol.
 * 
 * @author Righitto Simone
 */
public class ComputingEngProtocol {

	public final static int BUFFER_SIZE = 512;
	
	/**
	 * The default UDP port on which the client is using for Dynamic Discovery
	 */
	public final static int DEFAULT_UDP_PORT = 5050;
	
	public final static int DEFAULT_UDP_RESPONSE_PORT = 5051;
	
	/**
	 * The default TCP port on which the client is using for "interactions Calculs"
	 */
	public final static int DEFAULT_TCP_PORT = 6060;

	/**
	 * The default multicast address the client is using for Dynamic Discovery
	 */
	public final static String PROTOCOL_MULTICAST_ADDRESS = "239.255.22.5";
	
	public final static String PROTOCOL_COMPUTING_ENGINE_IP = "127.0.0.1";

	/**
	 * This enum type defines the possible states for the Dynamic Discovery
	 * state machine
	 */
	public enum State implements IState {
		STATE_START_UP, 
		STATE_LISTENING, 
		STATE_RESPONDING
	}

	/**
	 * This enum type defines the types of messages that can be exchanged by
	 * clients and servers using the Dynamic Discovery.
	 */
	public enum MessageType implements IMessageType {
		MSG_HELLO, 
		MSG_HERE_I_AM,
	}

	/**
	 * Definition of the possible messages
	 */
	public final static String MSG_HELLO = "HELLO";
	public final static String MSG_HERE_I_AM = "HERE_I_AM";
	
	/**
	 * This enum type defines the protocol commands defined by the Dynamic Discovery.
	 * The commands are encapsulated in messages
	 */
	public enum Command {
		CMD_HELLO(MSG_HELLO, "announce in broadcast that we are looking for some computing engines"),
		CMD_HERE_I_AM(MSG_HERE_I_AM, "announce the computing engine ip and tcp port");
		
		private final String keyword;
		private final String help;
		
		Command(String keyword, String help) {
			this.keyword = keyword;
			this.help = help;
		}

		public String getKeyword() {
			return keyword;
		}

		public String getHelp() {
			return help;
		}
		
	}


}
