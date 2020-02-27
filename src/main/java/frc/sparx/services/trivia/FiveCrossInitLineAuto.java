package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class FiveCrossInitLineAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "AT LEAST FIVE robots cross the initiation live in AUTO ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String crossedStr = "";
		int crossed = 0;;
		if(score.getBlue().getInitLineRobot1().equalsIgnoreCase(crossedStr)) {
			crossed++; 
		}
		if(score.getBlue().getInitLineRobot2().equalsIgnoreCase(crossedStr)) {
			crossed++;
		}
		if(score.getBlue().getInitLineRobot3().equalsIgnoreCase(crossedStr)) {
			crossed++;
		}
		if(score.getRed().getInitLineRobot1().equalsIgnoreCase(crossedStr)) {
			crossed++; 
		}
		if(score.getRed().getInitLineRobot2().equalsIgnoreCase(crossedStr)) {
			crossed++;
		}
		if(score.getRed().getInitLineRobot3().equalsIgnoreCase(crossedStr)) {
			crossed++;
		}
		return crossed >= 5;
	}
	

}
