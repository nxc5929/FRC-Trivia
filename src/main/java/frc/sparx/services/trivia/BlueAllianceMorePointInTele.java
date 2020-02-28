package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInTele extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more TELEOP points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getTeleopPoints() < score.getBlue().getTeleopPoints();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, Blue alliance got more TELEOP points then RED ("+score.getBlue().getTeleopPoints() +">"+ score.getRed().getTeleopPoints()+")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Not today, Blue alliance got less TELEOP points then RED ("+score.getBlue().getTeleopPoints() +"<"+ score.getRed().getTeleopPoints()+")";
	}

}
