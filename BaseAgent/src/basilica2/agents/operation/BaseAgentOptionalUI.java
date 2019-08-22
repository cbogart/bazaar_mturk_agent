package basilica2.agents.operation;

import java.awt.BorderLayout;
import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;

import edu.cmu.cs.lti.project911.utils.log.Logger;

public interface BaseAgentOptionalUI {
	

	public void tick();
	
	
	public void addAgentWidget(String name, AgentWidget agentWidget);


	public void agentLaunched(String name);


	public void agentStopped(String name);


	public void setRoomName(String room);


	public void setLocation(Point point);


	public void operationStarted();
}
