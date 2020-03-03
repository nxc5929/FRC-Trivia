package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedGetLevelClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED ("+getRedAlliance(upcomingMatch)+") get a leveled climb?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getEndgameRungIsLevel().equalsIgnoreCase(Constants.BAR_LEVELED);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "RED got the level climb with ease!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "No Level for RED";
	}

}
