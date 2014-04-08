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

		Message message = new Message(
				SmartCalcProtocol.MessageType.MSG_HERE_I_AM);
		message.setAttribute("command", tokens[0]);
		message.setAttribute("arguments", arguments);
		message.setAttribute("payload", new String(data));

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
			// sb.append(SmartCalcProtocol.MSG_HELLO);
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
