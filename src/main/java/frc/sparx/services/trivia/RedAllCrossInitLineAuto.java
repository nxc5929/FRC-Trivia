package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedAllCrossInitLineAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "All RED("+getRedAlliance(upcomingMatch)+") robots cross the initiation live in AUTO";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String crossedStr = "";
		return score.getRed().getInitLineRobot1().equalsIgnoreCase(crossedStr) && 
				score.getRed().getInitLineRobot2().equalsIgnoreCase(crossedStr) &&
				score.getRed().getInitLineRobot3().equalsIgnoreCase(crossedStr);
	}
	

}
