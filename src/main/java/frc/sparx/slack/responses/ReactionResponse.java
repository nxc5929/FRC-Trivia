package frc.sparx.slack.responses;

public class ReactionResponse {
	private boolean ok;
	private String channel;
	private ReactionMessage message;
	
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public ReactionMessage getMessage() {
		return message;
	}
	public void setMessage(ReactionMessage message) {
		this.message = message;
	}
}
