package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedAllianceMorePointInTele extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED("+getRedAlliance(upcomingMatch)+") get more TELEOP points then BLUE("+getBlueAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getTeleopPoints() > score.getBlue().getTeleopPoints();
	}
	
	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, RED alliance got more TELEOP points then BLUE ("+score.getRed().getTeleopPoints() +">"+ score.getBlue().getTeleopPoints()+")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Not today, RED alliance got less TELEOP points then BLUE ("+score.getRed().getTeleopPoints() +"<"+ score.getBlue().getTeleopPoints()+")";
	}

}
