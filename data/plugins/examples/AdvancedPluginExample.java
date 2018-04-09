package main;

import javax.swing.JOptionPane;
import main.AdvancedPlugin;

/**
* An example of a plug-in using the AdvancedPlugin interface.
*
* @author ShermanZero
*/
public class AdvancedPluginExample implements AdvancedPlugin {

	//plug-in name, version, and input it will receive from StreamSAK
	private String name, version, input;

	//default constructor sets the name and version
	public AdvancedPluginExample() {
		name = "AdvancedPlugin";
		version = "v1.0";
	}

	@Override
	//return the name of the plug-in
	public String getName() {
		return name;
	}

	@Override
	//return the version of the plug-in
	public String getVersion() {
		return version;
	}

	@Override
	//return the info to display as a prompt above the input field of StreamSAK
	//(only is called if requiresInput() returns true)
	public String getInfo() {
		return "Enter message";
	}

	@Override
	//set the input received from StreamSAK
	//(only is called if requiresInput() returns true)
	public void setInput(String input) {
		this.input = input;
	}

	@Override
	//return the entry the StreamSAK log should display after the plug-in runs
	//(only is called if requiresLogEntry() returns true)
	public String getLogEntry() {
		return "DISPLAYED: "+input;
	}

	@Override
	//return whether or not the plug-in requires input from the user through the StreamSAK input field
	public boolean requiresInput() {
		return true;
	}

	@Override
	//return whether or not the plug-in requires a log entry to be made after it executes
	public boolean requiresLogEntry() {
		return true;
	}

	@Override
	//when the user clicks the button, execute this action...
	public void doOnPress() {
		JOptionPane.showMessageDialog(null, "Hello from AdvancedPlugin, you entered:\n"+input, "AdvancedPlugin", JOptionPane.INFORMATION_MESSAGE);
	}

}
