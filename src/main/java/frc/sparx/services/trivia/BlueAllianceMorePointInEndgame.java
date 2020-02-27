package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInEndgame extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more ENDGAME points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getEndgamePoints() < score.getBlue().getEndgamePoints();
	}

}
