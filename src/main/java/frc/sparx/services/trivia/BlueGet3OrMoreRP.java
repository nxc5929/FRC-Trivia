package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueGet3OrMoreRP extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will Blue("+getBlueAlliance(upcomingMatch)+") get 3 OR MORE Ranking Points?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getBlue().getRp() >= 3;
	}

}
