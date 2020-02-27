package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedGetTwoRanking extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will get EXACTLY 2 Ranking Points";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getRp() == 2;
	}

}
