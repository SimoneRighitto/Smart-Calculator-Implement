package ch.heigvd.res.toolkit.computingEngine_server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;

import ch.heigvd.res.toolkit.impl.AbstractStateMachine;
import ch.heigvd.res.toolkit.impl.Event;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IState;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;

public class ComputingEngProtocolStateMachine extends AbstractStateMachine implements IStateMachine {

	public ComputingEngProtocolStateMachine(IContext context) {
		super(context);
	}

	@Override
	public void onEvent(Event event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public IState getInitialState() {
		// TODO Auto-generated method stub
		return null;
	}
}
