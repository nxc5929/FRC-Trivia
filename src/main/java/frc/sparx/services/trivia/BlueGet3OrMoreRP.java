package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueGet3OrMoreRP extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will Blue("+getBlueAlliance(upcomingMatch)+") get 3 OR MORE Ranking Points?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		int rankingPoints = score.getBlue().getRp();
		return rankingPoints >= 3;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Correct, Blue got " + score.getBlue().getRp() + " ranking point!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "inCorrect, Blue only got " + score.getBlue().getRp() + " ranking point";
	}

}
