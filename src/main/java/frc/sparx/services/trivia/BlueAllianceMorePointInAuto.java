package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more AUTO points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getAutoPoints() < score.getBlue().getAutoPoints();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, Blue alliance got more AUTO points then RED ("+score.getBlue().getAutoPoints() +">"+ score.getRed().getAutoPoints()+")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, Blue alliance got less AUTO points then RED ("+score.getBlue().getAutoPoints() +"<"+ score.getRed().getAutoPoints()+")";
	}

}
