package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedActivateStage2 extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will activate Stage 2";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().isStage2Activated();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "With ease, RED activates stage 2";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Maybe next time, RED doesn't activates stage 2";
	}

}
