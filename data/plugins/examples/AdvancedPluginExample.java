package main;

import javax.swing.JOptionPane;

public class AdvancedPluginExample implements AdvancedPlugin {

	private String name;
	private String version;
	private String input;
	
	public AdvancedPluginExample() {
		name = "AdvancedPlugin";
		version = "v1.0";
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public String getVersion() {
		return version;
	}
	
	@Override
	public void doOnPress() {
		JOptionPane.showMessageDialog(null, "Hello from AdvancedPlugin, you entered:\n"+input, "AdvancedPlugin", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	public void setInput(String input) {
		this.input = input;
	}
	
	@Override
	public boolean requiresLogEntry() {
		return true;
	}
	
	@Override
	public boolean requiresInput() {
		return true;
	}
	
	@Override
	public String getInfo() {
		return "Enter message";
	}
	
	@Override
	public String getLogEntry() {
		return "DISPLAYED: "+input;
	}

}
