package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class GreaterThan120CominedPoints extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Total combined score will be greater than 120 ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getTotalPoints() + score.getBlue().getTotalPoints() >= 120;
	}

}
