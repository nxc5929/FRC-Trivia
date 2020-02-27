package frc.sparx.slack.responses;

public class ReactionMessage {
	
	private String ts;
	private Reaction[] reactions;
	
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public Reaction[] getReactions() {
		return reactions;
	}
	public void setReactions(Reaction[] reactions) {
		this.reactions = reactions;
	}
}
