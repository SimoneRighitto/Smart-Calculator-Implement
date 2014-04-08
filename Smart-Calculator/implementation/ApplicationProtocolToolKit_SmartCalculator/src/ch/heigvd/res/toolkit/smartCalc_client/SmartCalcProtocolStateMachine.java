package ch.heigvd.res.toolkit.smartCalc_client;

import ch.heigvd.res.toolkit.impl.AbstractStateMachine;
import ch.heigvd.res.toolkit.impl.Event;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IState;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;

public class SmartCalcProtocolStateMachine extends AbstractStateMachine	implements IStateMachine {

	public SmartCalcProtocolStateMachine(IContext context) {
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
