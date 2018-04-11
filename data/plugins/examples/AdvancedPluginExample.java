package main;

import javax.swing.JOptionPane;

import main.types.StreamSAKAdvancedPlugin;

public class AdvancedPluginExample extends StreamSAKAdvancedPlugin {

	public AdvancedPluginExample() {
		super("AdvancedPlugin", "v1.0");

		super.getInput().setRequired(true);
		super.getLogEntry().setRequired(true);

		super.getInput().setMessage("ENTER MESSAGE");
	}

	@Override
	public void doOnPress() {
		String userInput = super.getInput().getData();

		JOptionPane.showMessageDialog(null, "Hello from AdvancedPlugin, you entered:\n"+userInput, "AdvancedPlugin", JOptionPane.INFORMATION_MESSAGE);
		super.getLogEntry().setEntry("You wrote: "+userInput);
	}

}
