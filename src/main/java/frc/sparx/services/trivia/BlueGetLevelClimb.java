package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueGetLevelClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will BLUE ("+getBlueAlliance(upcomingMatch)+") get a leveled climb?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getBlue().getEndgameRungIsLevel().equalsIgnoreCase("Leveled");
	}

}
