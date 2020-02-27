package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwentyFivePenaltyPoints extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "There will be 25+ penalty points ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getFoulPoints() + score.getBlue().getFoulPoints() >= 25;
	}

}
