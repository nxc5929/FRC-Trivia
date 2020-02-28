package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Blue6IntoInner extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "BLUE("+getBlueAlliance(upcomingMatch)+") will score at least 6 power cells into INNER GOAL";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return (score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner()) >= 6;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, Blue scored " + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner() + " cells into the inner goal!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, Blue only scored " + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner() + " cells into the inner goal";
	}

}
