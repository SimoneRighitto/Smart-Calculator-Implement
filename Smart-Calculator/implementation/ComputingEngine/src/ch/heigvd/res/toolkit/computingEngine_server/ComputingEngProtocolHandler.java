package ch.heigvd.res.toolkit.computingEngine_server;

import ch.heigvd.res.toolkit.impl.AbstractProtocolHandler;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IProtocolSerializer;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;


public class ComputingEngProtocolHandler extends AbstractProtocolHandler {

	public ComputingEngProtocolHandler(IProtocolSerializer protocolSerializer){
		super(protocolSerializer);
	}
	
	@Override
	public IStateMachine getProtocolStateMachine(IContext context) {
		return new ComputingEngProtocolStateMachine(context);
	}
}
