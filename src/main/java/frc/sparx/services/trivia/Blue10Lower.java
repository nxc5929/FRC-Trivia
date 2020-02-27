package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Blue10Lower extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "BLUE("+getBlueAlliance(upcomingMatch)+") will score AT LEAST 10 power cells into the LOW GOAL";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getBlue().getAutoCellsBottom() + score.getBlue().getTeleopCellsBottom() >= 10;
	}

}
