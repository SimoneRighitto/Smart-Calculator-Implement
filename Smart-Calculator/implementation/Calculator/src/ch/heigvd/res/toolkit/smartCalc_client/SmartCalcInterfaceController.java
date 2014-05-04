package ch.heigvd.res.toolkit.smartCalc_client;
import ch.heigvd.res.toolkit.impl.TcpLineInterfaceController;
import ch.heigvd.res.toolkit.impl.UdpLineInterfaceController;



public class SmartCalcInterfaceController extends UdpLineInterfaceController {

	public SmartCalcInterfaceController(int port) {
		super(port);
	}

}