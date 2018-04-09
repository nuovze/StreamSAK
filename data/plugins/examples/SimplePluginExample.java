package main;

import javax.swing.JOptionPane;

import main.SimplePlugin;

public class SimplePluginExample implements SimplePlugin {

	private String name;
	private String version;
	
	public SimplePluginExample() {
		name = "SimplePlugin";
		version = "v1.0";
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void doOnPress() {
		JOptionPane.showMessageDialog(null, "Hello from the SimplePlugin", "SimplePlugin", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public String getVersion() {
		return version;
	}

}
