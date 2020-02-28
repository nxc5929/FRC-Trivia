package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedWinningTeam extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will the RED alliance (" + getRedAlliance(upcomingMatch) + ") beat BLUE ("+ getBlueAlliance(upcomingMatch) +")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getTotalPoints() > score.getBlue().getTotalPoints();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "True, RED beat BLUE ("+score.getRed().getTotalPoints()+ " to " + score.getBlue().getTotalPoints() + ")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "False, RED lost to BLUE ("+score.getRed().getTotalPoints()+ " to " + score.getBlue().getTotalPoints() + ")";
	}
	
	
}
