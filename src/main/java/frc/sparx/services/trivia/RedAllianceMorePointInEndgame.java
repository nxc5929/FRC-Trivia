package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedAllianceMorePointInEndgame extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED("+getRedAlliance(upcomingMatch)+") get more ENDGAME points then BLUE("+getBlueAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getEndgamePoints() > score.getBlue().getEndgamePoints();
	}

}
