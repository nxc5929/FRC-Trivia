package frc.sparx.slack.requests;

public class SlackAddReaction {
	
	private String channel;
	private String name;
	private String timestamp;
	
	public SlackAddReaction(String channel, String name, String timestamp) {
		this.channel = channel;
		this.name = name;
		this.timestamp = timestamp;
	}
	
	
	public String getChannel() {
		return channel;
	}
	public String getName() {
		return name;
	}
	public String getTimestamp() {
		return timestamp;
	}
}
