package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Red5Lower extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will score AT LEAST 5 power cells into the LOW GOAL";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getAutoCellsBottom() + score.getRed().getTeleopCellsBottom() >= 5;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, RED scored " + score.getRed().getAutoCellsBottom() + score.getRed().getTeleopCellsBottom() + " cells into the lower goal";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, RED only scored " + score.getRed().getAutoCellsBottom() + score.getRed().getTeleopCellsBottom() + " cells into the lower goal";
	}

}
