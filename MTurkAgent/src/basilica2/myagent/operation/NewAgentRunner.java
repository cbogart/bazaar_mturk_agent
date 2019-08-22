package basilica2.myagent.operation;

import basilica2.agents.operation.BaseAgentOperation;
import basilica2.agents.operation.BaseAgentOptionalUI;
import basilica2.agents.operation.BaseAgentUI;
import basilica2.agents.operation.BaseAgentWithoutUI;
import basilica2.agents.operation.ConditionAgentUI;

public class NewAgentRunner extends BaseAgentOperation {
	static boolean headless = false;  // Run without a GUI
	public static void main(final String[] args) {
		initializeSystemProperties("system.properties");
		if (args.length > 0 && args[0].contentEquals("headless")) {
			headless = true;
		}
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				NewAgentRunner thisOperation = new NewAgentRunner();
				String[] conditions = thisOperation.getProperties().getProperty("operation.conditions", "")
						.split("[\\s,]+");
				String room = thisOperation.getProperties().getProperty("operation.room", "Try");
				BaseAgentOptionalUI thisUI = null;
				if (headless) {
					thisUI = new BaseAgentWithoutUI(thisOperation, room); 
				} else {
				    thisUI = new ConditionAgentUI(thisOperation, room, conditions);
				}
				thisOperation.setUI(thisUI);
				thisOperation.startOperation();
				thisUI.operationStarted();
				thisOperation.processArgs(args);
			}
		});
	}
}
