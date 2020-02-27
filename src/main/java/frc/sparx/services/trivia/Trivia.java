package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public abstract class Trivia {
	
	public abstract String getQuestion(UpcomingMatch upcomingMatch);
	public abstract boolean getResult(ScoreBreakdown score);
	
	public String getBlueAlliance(UpcomingMatch upcomingMatch) {
		return getAlliance(upcomingMatch.getBlueTeams());
	}
	
	public String getRedAlliance(UpcomingMatch upcomingMatch) {
		return getAlliance(upcomingMatch.getRedTeams());
	}
	
	public String getAlliance(String[] team) {
		return removeTeamTag(team[0]) + ", " + removeTeamTag(team[1]) + ", " + removeTeamTag(team[2]);
	}
	
	public String removeTeamTag(String team) {
		return team.replaceAll("frc", "");
	}
	
}
