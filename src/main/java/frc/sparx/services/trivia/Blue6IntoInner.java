package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Blue6IntoInner extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "BLUE("+getBlueAlliance(upcomingMatch)+") will score at least 6 power cells into INNER GOAL";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return (score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner()) >= 6;
	}

}
