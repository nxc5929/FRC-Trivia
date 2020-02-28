package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwentyBallIntoOuter extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "At least 20 power cells will be scored into the OUTER GOAL ("+getRedAlliance(upcomingMatch)+", "+getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return getOuterBallCount(score) >= 20;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int outercount = getOuterBallCount(score);
		return "True! " + outercount + " power cells were scored into the OUTER GOAL!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int outercount = getOuterBallCount(score);
		return "Close but no! Only " + outercount + " power cells were scored into the OUTER GOAL!";
	}
	
	private int getOuterBallCount(ScoreBreakdown score) {
		return score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter() + 
		score.getBlue().getAutoCellsOuter() + score.getBlue().getTeleopCellsOuter();
	}

}
