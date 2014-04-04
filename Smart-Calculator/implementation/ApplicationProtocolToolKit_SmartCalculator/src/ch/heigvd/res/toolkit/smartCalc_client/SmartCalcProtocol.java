package ch.heigvd.res.toolkit.smartCalc_client;

/**
 * This class is used to define constants and enum types specific to the
 * Distributed Computing Protocol.
 *
 * @author Olivier Liechti
 */
public class SmartCalcProtocol {

	
	/**
	 * The default UDP port on which the client is using for Dynamic Discovery
	 */
	public final static int DEFAULT_UDP_PORT = 5050;
	
	/**
	 * The default multicast address the client is using for Dynamic Discovery
	 */
	public final static String PROTOCOL_MULTICAST_ADDRESS = "239.255.22.5";
	
	
	/**
	 * Definition of the possible messages
	 */
	public final static String MSG_HELLO = "HELLO";
	public final static String MSG_HERE_I_AM = "HERE_I_AM";
	
	
}
