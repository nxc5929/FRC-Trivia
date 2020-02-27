package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedActivateStage2 extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will activate Stage 2";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().isStage2Activated();
	}

}
