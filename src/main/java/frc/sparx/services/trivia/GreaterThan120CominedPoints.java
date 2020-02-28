package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class GreaterThan120CominedPoints extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Total combined score will be greater than 120 ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getTotalPoints() + score.getBlue().getTotalPoints() >= 120;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int total = score.getRed().getTotalPoints() + score.getBlue().getTotalPoints();
		return "Big Scoreing Match! " + total + " total points!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int total = score.getRed().getTotalPoints() + score.getBlue().getTotalPoints();
		return "Close, but no. Only " + total + " total points";
	}

}
