package ch.heigvd.res.toolkit.smartCalc_client;

import ch.heigvd.res.toolkit.impl.AbstractStateMachine;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;

public class SmartCalcProtocolStateMachine extends AbstractStateMachine	implements IStateMachine {

	public SmartCalcProtocolStateMachine(IContext context) {
		super(context);
	}
}
