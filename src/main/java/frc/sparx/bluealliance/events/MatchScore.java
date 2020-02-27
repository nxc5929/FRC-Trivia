package frc.sparx.bluealliance.events;

public class MatchScore {

	private String event_key;
	private Match match;
	
	public String getEvent_key() {
		return event_key;
	}
	public void setEvent_key(String event_key) {
		this.event_key = event_key;
	}
	public Match getMatch() {
		return match;
	}
	public void setMatch(Match match) {
		this.match = match;
	}
}
