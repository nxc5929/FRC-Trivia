package frc.sparx.slack.requests;

public class SlackMessageRequest {
	private String text;
	private String channel;

	public SlackMessageRequest() {}
	
	public SlackMessageRequest(String channel, String text) {
		this.channel = channel;
		this.text = text;
		System.out.println("Channel: " + channel);
		System.out.println("Text: " + text);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	
}
