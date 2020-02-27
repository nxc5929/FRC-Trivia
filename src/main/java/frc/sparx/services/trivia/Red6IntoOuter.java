package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Red6IntoOuter extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will score at least 6 power cells into OUTER GOAL";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return (score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter()) >= 6;
	}

}
