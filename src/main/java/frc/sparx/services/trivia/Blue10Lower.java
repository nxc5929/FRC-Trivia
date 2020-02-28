package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Blue10Lower extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "BLUE("+getBlueAlliance(upcomingMatch)+") will score AT LEAST 10 power cells into the LOW GOAL";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		int cellsLow = score.getBlue().getAutoCellsBottom() + score.getBlue().getTeleopCellsBottom();
		return cellsLow >= 10;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, BLUE scored " + score.getBlue().getAutoCellsBottom() + score.getBlue().getTeleopCellsBottom() + " cells into the lower goal";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, BLUE only scored " + score.getBlue().getAutoCellsBottom() + score.getBlue().getTeleopCellsBottom() + " cells into the lower goal";
	}

}
