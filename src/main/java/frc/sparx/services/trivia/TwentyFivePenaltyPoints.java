package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwentyFivePenaltyPoints extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "There will be 25+ penalty points ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getFoulPoints() + score.getBlue().getFoulPoints() >= 25;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int foulPoints = score.getRed().getFoulPoints() + score.getBlue().getFoulPoints();
		return "True, there were " + foulPoints + "points worth of penalties that match =(";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int foulPoints = score.getRed().getFoulPoints() + score.getBlue().getFoulPoints();
		return "Nope, there were only " + foulPoints + "points worth of penalties";
	}

}
