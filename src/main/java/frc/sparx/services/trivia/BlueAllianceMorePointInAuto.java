package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more AUTO points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getAutoPoints() < score.getBlue().getAutoPoints();
	}

}
