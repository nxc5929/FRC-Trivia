package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueActivateStage3 extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "BLUE("+getBlueAlliance(upcomingMatch)+") will activate Stage 3";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().isStage3Activated();
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yes, Blue activated stage 3!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, Blue didn't activated stage 3";
	}

}
