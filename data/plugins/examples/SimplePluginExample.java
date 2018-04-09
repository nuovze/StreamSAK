package main;

import javax.swing.JOptionPane;
import main.SimplePlugin;

/**
* An example of a plug-in using the SimplePlugin interface.
*
* @author ShermanZero
*/
public class SimplePluginExample implements SimplePlugin {

	//plug-in name and version
	private String name, version;

	//default constructor sets the name and version
	public SimplePluginExample() {
		name = "SimplePlugin";
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
	//when the user clicks the button, execute this action...
	public void doOnPress() {
		JOptionPane.showMessageDialog(null, "Hello from the SimplePlugin", "SimplePlugin", JOptionPane.INFORMATION_MESSAGE);
	}

}
