package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class FifteenBallIntoInner extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "At least 15 power cells will be scored into the INNER GOAL ("+getRedAlliance(upcomingMatch)+", "+getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return (score.getRed().getAutoCellsInner() + score.getRed().getTeleopCellsInner() + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner()) >= 15;
	}

}
