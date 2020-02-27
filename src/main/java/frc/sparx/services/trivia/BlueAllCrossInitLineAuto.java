package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllCrossInitLineAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "All BLUE("+getBlueAlliance(upcomingMatch)+") robots cross the initiation live in AUTO";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String crossedStr = "";
		return score.getBlue().getInitLineRobot1().equalsIgnoreCase(crossedStr) && 
				score.getBlue().getInitLineRobot2().equalsIgnoreCase(crossedStr) &&
				score.getBlue().getInitLineRobot3().equalsIgnoreCase(crossedStr);
	}
	

}
