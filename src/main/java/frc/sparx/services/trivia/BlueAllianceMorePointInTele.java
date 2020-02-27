package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInTele extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more TELEOP points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getTeleopPoints() < score.getBlue().getTeleopPoints();
	}

}
