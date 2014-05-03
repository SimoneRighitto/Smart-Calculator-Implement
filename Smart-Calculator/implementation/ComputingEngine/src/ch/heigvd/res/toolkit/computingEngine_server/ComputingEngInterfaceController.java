package ch.heigvd.res.toolkit.computingEngine_server;
import ch.heigvd.res.toolkit.impl.TcpLineInterfaceController;
import ch.heigvd.res.toolkit.impl.UdpLineInterfaceController;



public class ComputingEngInterfaceController extends UdpLineInterfaceController {

	public ComputingEngInterfaceController(int port) {
		super(port);
	}

}