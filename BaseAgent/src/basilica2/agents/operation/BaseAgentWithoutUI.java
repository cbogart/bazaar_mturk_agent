package basilica2.agents.operation;

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.swing.DefaultListModel;

public class BaseAgentWithoutUI implements BaseAgentOptionalUI {

	BaseAgentOperation myOperation;
	String room = "";
	List<String> agents = new ArrayList<String>();

	/** Creates new OperationUI */

	public BaseAgentWithoutUI(BaseAgentOperation o)
	{
		this(o, "Test1");
	}

	public BaseAgentWithoutUI(BaseAgentOperation o, String roomName)
	{
		myOperation = o;
		room = roomName;
		
		final Timer t = new java.util.Timer();
		t.schedule( 
		        new java.util.TimerTask() {
		            @Override
		            public void run() {
		            	for(String a: agents) {
		            		
		            	}
		            	triggerStart();   
		                t.cancel();
		            }
		        }, 
		        5000 
		);
		
	}
	
	public void triggerStart() {
		myOperation.launchAgent(room);
	}
	public void  triggerStopAgent(String agent_name) {
		myOperation.stopAgent(agent_name);
	}
	public void triggerStopOperation() {
		myOperation.stopOperation();
	}
	
	@Override
	public void addAgentWidget(String name, AgentWidget agentWidget) {
		System.out.println("BaseAgentWithoutUI.addAgentWidget(" + name + ")");
		agents.add(name);
		
	}
	
	public List showAgents() {
		return agents;
	}

	@Override
	public void agentLaunched(String name) {
		System.out.println("BaseAgentWithoutUI.agentStopped(" + name + ")");

	}

	@Override
	public void agentStopped(String name) {
		System.out.println("BaseAgentWithoutUI.agentStopped(" + name + ")");

	}

	@Override
	public void setRoomName(String room) {
		System.out.println("BaseAgentWithoutUI.setRoomName(" + room + ")");
		
	}

	@Override
	public void setLocation(Point point) {
		System.out.println("BaseAgentWithoutUI.setLocation(" + point + ")");

	}

	@Override
	public void tick() {
		//System.out.println("BaseAgentWithoutUI.tick");
		
	}

	@Override
	public void operationStarted() {
		System.out.println("BaseAgentWithoutUI.operationStarted");
	}

}
