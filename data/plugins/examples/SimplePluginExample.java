package main;

import javax.swing.JOptionPane;

import main.types.StreamSAKSimplePlugin;

public class SimplePluginExample extends StreamSAKSimplePlugin {

	public SimplePluginExample() {
		super("SimplePlugin", "v1.0");
	}

	@Override
	public void doOnPress() {
		JOptionPane.showMessageDialog(null, "Hello from the SimplePlugin", "SimplePlugin", JOptionPane.INFORMATION_MESSAGE);
	}

}
