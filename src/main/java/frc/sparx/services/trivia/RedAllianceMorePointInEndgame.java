package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedAllianceMorePointInEndgame extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED("+getRedAlliance(upcomingMatch)+") get more ENDGAME points then BLUE("+getBlueAlliance(upcomingMatch)+")?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getEndgamePoints() > score.getBlue().getEndgamePoints();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, RED alliance got more ENDGAME points then BLUE ("+score.getRed().getEndgamePoints() +">"+ score.getBlue().getEndgamePoints()+")";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, RED alliance got less ENDGAME points then BLUE ("+score.getRed().getEndgamePoints() +"<"+ score.getBlue().getEndgamePoints()+")";
	}

}
