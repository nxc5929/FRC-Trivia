package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class Red5Lower extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "RED("+getRedAlliance(upcomingMatch)+") will score AT LEAST 5 power cells into the LOW GOAL";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getAutoCellsBottom() + score.getRed().getTeleopCellsBottom() >= 5;
	}

}
