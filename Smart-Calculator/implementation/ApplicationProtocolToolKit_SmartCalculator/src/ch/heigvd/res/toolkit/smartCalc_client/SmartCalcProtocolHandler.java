package ch.heigvd.res.toolkit.smartCalc_client;

import ch.heigvd.res.toolkit.impl.AbstractProtocolHandler;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IProtocolSerializer;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;


public class SmartCalcProtocolHandler extends AbstractProtocolHandler {

	public SmartCalcProtocolHandler(IProtocolSerializer protocolSerializer){
		super(protocolSerializer);
	}
	
	@Override
	public IStateMachine getProtocolStateMachine(IContext context) {
		return new SmartCalcProtocolStateMachine(context);
	}
}
