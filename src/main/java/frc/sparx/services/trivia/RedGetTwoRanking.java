package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedGetTwoRanking extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will get EXACTLY 2 Ranking Points";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getRp() == 2;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Sure did, RED got exactly 2 RPs!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Close but no. RED got " + score.getRed().getRp() + " RPs";
	}

}
