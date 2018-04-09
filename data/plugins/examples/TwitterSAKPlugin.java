package main;

import javax.swing.JOptionPane;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
* An example of a plug-in using the AdvancedPlugin interface which prompts the
* user for a tweet, and then posts it on Twitter.  This also uses methods from
* the twitter4j library.
*
* @author ShermanZero
*/
public class TwitterSAKPlugin implements AdvancedPlugin {

	public static void main(String [] args) {}

	//plug-in name, version, and input it will receive from StreamSAK
	private String name, version, input;

	//default constructor sets the name and version
	public TwitterSAKPlugin() {
		name = "TweetForMe";
		version = "1.0";
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
		return "ENTER TWEET";
	}

	@Override
	//set the input received from StreamSAK
	//(only is called if requiresInput() returns true)
	public void setInput(String arg0) {
		this.input = arg0;
	}

	@Override
	//return the entry the StreamSAK log should display after the plug-in runs
	//(only is called if requiresLogEntry() returns true)
	public String getLogEntry() {
		return "TWEETED: "+input;
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
		post(input);
	}

	//post a tweet to Twitter
	private void post(String post) {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
			.setOAuthConsumerKey("***********************") 	//
			.setOAuthConsumerSecret("***********************")	// I've obviously hid my account details here,
			.setOAuthAccessToken("************************")	// but I can assure you that the program works
			.setOAuthAccessTokenSecret("***********************");	//

		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();

		if(post == null || post.equals(""))
			exit("Tweet contains no data");

		try { twitter.updateStatus(post); } catch (TwitterException e) { exit(e.getErrorMessage()); }
	}

	//exit and display a message
	private void exit(String message) {
		if(message != null)
			JOptionPane.showMessageDialog(null, message);

		System.exit(0);
	}

}
