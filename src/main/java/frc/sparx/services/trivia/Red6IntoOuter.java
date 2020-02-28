package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Red6IntoOuter extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will score at least 6 power cells into OUTER GOAL";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return (score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter()) >= 6;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int outer = score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter();
		return "Sure did! RED scored " + outer + " power cells into the outer goal!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int outer = score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter();
		return "Nope, RED only scored " + outer + " power cells into the outer goal";
	}

}
