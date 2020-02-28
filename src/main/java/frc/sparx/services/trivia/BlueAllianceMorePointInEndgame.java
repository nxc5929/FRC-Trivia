package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllianceMorePointInEndgame extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE("+getBlueAlliance(upcomingMatch)+") get more ENDGAME points then RED("+getRedAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getEndgamePoints() < score.getBlue().getEndgamePoints();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, Blue alliance got more ENDGAME points then RED ("+score.getBlue().getEndgamePoints() +">"+ score.getRed().getEndgamePoints()+")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, Blue alliance got less ENDGAME points then RED ("+score.getBlue().getEndgamePoints() +"<"+ score.getRed().getEndgamePoints()+")";
	}

}
