package ch.heigvd.res.toolkit.smartCalc_client;

import java.util.LinkedList;
import java.util.List;

import ch.heigvd.res.toolkit.impl.InvalidMessageException;
import ch.heigvd.res.toolkit.impl.Message;
import ch.heigvd.res.toolkit.interfaces.IProtocolSerializer;
import ch.heigvd.res.toolkit.smartCalc_client.SmartCalcProtocol.Command;

public class SmartCalcProtocolSerializer implements IProtocolSerializer {

	@Override
	public Message deserialize(byte[] data) throws InvalidMessageException {

		String sData = new String(data);
		String[] tokens = sData.split(":");
		List<String> arguments = new LinkedList<>();
		for (int i = 1; i < tokens.length; i++) {
			arguments.add(tokens[i]);
		}

		Message message;
		if(tokens[0].compareTo(SmartCalcProtocol.MSG_HERE_I_AM)==0){
		message = new Message(SmartCalcProtocol.MessageType.MSG_HERE_I_AM);
		}
		else{
			throw new InvalidMessageException();
		}
		message.setAttribute("command", tokens[0]);
		message.setAttribute("port", arguments);
		message.setAttribute("ip", new String(data));

		boolean validCommand = false;
		for (Command protocolCommand : SmartCalcProtocol.Command.values()) {
			if (protocolCommand.getKeyword().equals(tokens[0])) {
				validCommand = true;
				break;
			}
		}
		if (!validCommand) {
			throw new InvalidMessageException();
		}

		return message;
	}

	@Override
	public byte[] serialize(Message message) {
		StringBuilder sb = new StringBuilder();

		switch ((SmartCalcProtocol.MessageType) message.getType()) {
		case MSG_HELLO:
			sb.append(SmartCalcProtocol.MSG_HELLO );
			break;
		case MSG_HERE_I_AM:
			sb.append(SmartCalcProtocol.MSG_HERE_I_AM + ":");
			sb.append(message.getAttribute("payload"));
			break;
		}

		byte[] data = sb.toString().getBytes();

		return data;
	}

}
