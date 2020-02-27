package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedGetLevelClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Will RED ("+getRedAlliance(upcomingMatch)+") get a leveled climb?";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getEndgameRungIsLevel().equalsIgnoreCase("Leveled");
	}

}
