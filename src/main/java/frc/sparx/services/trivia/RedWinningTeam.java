package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedWinningTeam extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will the RED alliance (" + getRedAlliance(upcomingMatch) + ") beat BLUE ("+ getBlueAlliance(upcomingMatch) +")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getTotalPoints() > score.getBlue().getTotalPoints();
	}
	
	
}
