package frc.sparx.bluealliance.events;

public class UpcomingMatch{

	private String match_key;
	private String[] blueTeams;
	private String[] redTeams;
	private long predicted_time;
	
	public String getMatch_key() {
		return match_key;
	}
	public void setMatch_key(String match_key) {
		this.match_key = match_key;
	}
	public long getPredicted_time() {
		return predicted_time;
	}
	public void setPredicted_time(long predicted_time) {
		this.predicted_time = predicted_time;
	}
	public void setTeam_keys(String[] team) {
		blueTeams = new String[]{team[0], team[1], team[2]};
		redTeams = new String[]{team[3], team[4], team[5]};
	}
	public String[] getBlueTeams() {
		return blueTeams;
	}
	public String[] getRedTeams() {
		return redTeams;
	}
	
	@Override
	public String toString() {
		String tmp = match_key + ": ";
		for(String red: getRedTeams()) {
			tmp += red + ", ";
		}
		tmp += "vs ";
		for(String blue: getBlueTeams()) {
			tmp += blue + ", ";
		}
		return tmp;
	}
	
}
