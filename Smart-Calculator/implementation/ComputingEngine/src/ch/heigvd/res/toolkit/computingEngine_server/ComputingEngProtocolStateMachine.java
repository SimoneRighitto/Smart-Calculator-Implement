package ch.heigvd.res.toolkit.computingEngine_server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

import ch.heigvd.res.toolkit.impl.AbstractStateMachine;
import ch.heigvd.res.toolkit.impl.Event;
import ch.heigvd.res.toolkit.impl.Message;
import ch.heigvd.res.toolkit.interfaces.IContext;
import ch.heigvd.res.toolkit.interfaces.IState;
import ch.heigvd.res.toolkit.interfaces.IStateMachine;

public class ComputingEngProtocolStateMachine extends AbstractStateMachine implements IStateMachine {

		final static Logger LOG = Logger.getLogger(ComputingEngProtocolStateMachine.class.getName());

		/**
		 * This object is used to detect that the client has been inactive for too long
		 */
//		private final InactivityGuard inactivityGuard = new InactivityGuard();
//
//		/**
//		 * These three fields are part of the state for the state machine, i.e. their
//		 * value evolves in reaction to events and state transitions
//		 */
//		private int successCount = 0;
//		private int missedCount = 0;
//		private int lateCount = 0;

//		/**
//		 * This class detects when the client has not sent valid commands for too long
//		 */
//		private class InactivityGuard {
//
//			private Timer timer;
//
//			private long lastClientActivityTime;
//
//			public void start() {
//				lastClientActivityTime = System.currentTimeMillis();
//				timer = new Timer();
//				timer.schedule(new TimerTask() {
//					@Override
//					public void run() {
//						Event maxIdleTimeReachedEvent = new Event(PingPongProtocol.EventType.EVENT_TYPE_MAX_IDLE_TIME_REACHED);
//						ComputingEngProtocolStateMachine.this.onEvent(maxIdleTimeReachedEvent);
//					}
//				}, PingPongProtocol.MAX_INACTIVE_TIMEOUT, PingPongProtocol.MAX_INACTIVE_TIMEOUT);
//			}
//
//			public void stop() {
//				if (timer != null) {
//					timer.cancel();
//				}
//			}
//
//			public void notifyClientActivity() {
//				if (timer != null) {
//					timer.cancel();
//				}
//				start();
//			}
//		}

		public ComputingEngProtocolStateMachine(IContext context) {
			super(context);
		}

		@Override
		public void destroy() {
//			inactivityGuard.stop();
			System.out.println("Destroyyyeeeeddddddddddddddd");
		}

		@Override
		public IState getInitialState() {
			return ComputingEngProtocol.State.STATE_START_UP;
		}

		@Override
		public void onStateEntered(IState state) {
			super.onStateEntered(state);


			if (state == ComputingEngProtocol.State.STATE_START_UP) {
				//Normally here we have to send a multicast message: HERE_I_AM 
				//
				Message hereIAm = new Message(
						ComputingEngProtocol.MessageType.MSG_HERE_I_AM);

						hereIAm.setAttribute("command", ComputingEngProtocol.MSG_HERE_I_AM);
						hereIAm.setAttribute("port",
						ComputingEngProtocol.DEFAULT_TCP_PORT);
						hereIAm.setAttribute("ip",
						ComputingEngProtocol.PROTOCOL_COMPUTING_ENGINE_IP);

				//getContext().sendMessage(hereIAm);
				

				triggerTransitionToState(ComputingEngProtocol.State.STATE_LISTENING);

			}

//			/*
//			 When we enter STATE_END, we send a notification to inform the client that we are
//			 closing the connection. We then close the connection.
//			 */
//			if (state == ComputingEngProtocol.State.STATE_LISTENING) {
//				inactivityGuard.stop();
//				Message msg = new Message(PingPongProtocol.MessageType.MESSAGE_TYPE_NOTIFICATION);
//				msg.setAttribute("payload", PingPongProtocol.NOTIFICATION_CLOSING_TEXT);
//				getContext().sendMessage(msg);
//				getContext().closeSession();
//			}
		}

		@Override
		public void onEvent(Event e) {
			LOG.log(Level.INFO, "State Machine has received an event: {0} - {1}", new Object[]{e.getType(), e});

//			// Whatever the state, if we receive a HELP command, we know what to do
//			if (e.getType() == Event.EventType.EVENT_TYPE_MESSAGE_ARRIVED) {
//				Message incomingMessage = (Message) (e.getAttribute("message"));
//				String command = (String) incomingMessage.getAttribute("command");
//				if (PingPongProtocol.Command.CMD_HELP.getKeyword().equals(command)) {
//					Message message = new Message(PingPongProtocol.MessageType.MESSAGE_TYPE_RESULT);
//
//					StringBuilder helpMessagePayload = new StringBuilder("You can use the following commands: ");
//					for (PingPongProtocol.Command cmd : PingPongProtocol.Command.values()) {
//						helpMessagePayload.append("['")
//										.append(cmd.getKeyword())
//										.append("': ")
//										.append(cmd.getHelp())
//										.append("] ");
//					}
//					message.setAttribute("statusCode", "200");
//					message.setAttribute("payload", helpMessagePayload.toString());
//					getContext().sendMessage(message);
//					return;
//				}
//			}

			switch ((ComputingEngProtocol.State) getCurrentState()) {
				case STATE_LISTENING:
					onEventInStateListeningOrRunning(e);
					break;
				case STATE_RESPONDING:
					onEventInStateListeningOrRunning(e);
					break;
			}

		}

		/**
		 * This method handles events when the state machine is either in STATE_PING or STATE_PONG
		 * @param e the event
		 */
		private void onEventInStateListeningOrRunning(Event e) {
			switch ((Event.EventType) e.getType()) {
				case EVENT_TYPE_MESSAGE_ARRIVED:
					
					Message request = (Message) e.getAttribute("message");
					String command = (String) request.getAttribute("command");

					boolean successful = false;
					IState targetState = ComputingEngProtocol.State.STATE_LISTENING;
					
					if (getCurrentState() == ComputingEngProtocol.State.STATE_LISTENING) {
						successful = (command.equals(ComputingEngProtocol.Command.CMD_HELLO.getKeyword()));
				
					} 
//					else {
//						successful = (command.equals(PingPongProtocol.Command.CMD_PONG.getKeyword()));
//						targetState = PingPongProtocol.State.STATE_PING;
//					}

					if (successful) {
//						successCount++;
						Message hereIAm = new Message(
								ComputingEngProtocol.MessageType.MSG_HERE_I_AM);

								hereIAm.setAttribute("command", ComputingEngProtocol.MSG_HERE_I_AM);
								hereIAm.setAttribute("port",
								ComputingEngProtocol.DEFAULT_TCP_PORT);
								hereIAm.setAttribute("ip",
								ComputingEngProtocol.PROTOCOL_COMPUTING_ENGINE_IP);
//						reply.setAttribute("statusCode", "200");
//						reply.setAttribute("payload", PingPongProtocol.RESULT_SUCCESS_TEXT);
//						getContext().sendMessage(reply);
						getContext().sendMessage(hereIAm);
						triggerTransitionToState(targetState);
					}
//					else {
//						missedCount++;
//						reply.setAttribute("statusCode", "200");
//						reply.setAttribute("payload", PingPongProtocol.RESULT_FAIL_TEXT);
//						getContext().sendMessage(reply);
//					}
					break;
			}
		}

	}

