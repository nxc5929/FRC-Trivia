package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwentyBallIntoOuter extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "At least 20 power cells will be scored into the OUTER GOAL ("+getRedAlliance(upcomingMatch)+", "+getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return (score.getRed().getAutoCellsOuter() + score.getRed().getTeleopCellsOuter() + 
				score.getBlue().getAutoCellsOuter() + score.getBlue().getTeleopCellsOuter()) >= 20;
	}

}
