package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueGetLevelClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE ("+getBlueAlliance(upcomingMatch)+") get a leveled climb?";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getBlue().getEndgameRungIsLevel().equalsIgnoreCase(Constants.BAR_LEVELED);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yes, switch is level";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "No, switch is not level";
	}

}
