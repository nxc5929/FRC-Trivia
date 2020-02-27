package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedAllianceMorePointInAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED("+getRedAlliance(upcomingMatch)+") get more AUTO points then BLUE("+getBlueAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getAutoPoints() > score.getBlue().getAutoPoints();
	}

}
