package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueAllCrossInitLineAuto extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "All BLUE("+getBlueAlliance(upcomingMatch)+") robots cross the initiation live in AUTO";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		String crossedStr = Constants.EXITED_INIT_LINE;
		return score.getBlue().getInitLineRobot1().equalsIgnoreCase(crossedStr) && 
				score.getBlue().getInitLineRobot2().equalsIgnoreCase(crossedStr) &&
				score.getBlue().getInitLineRobot3().equalsIgnoreCase(crossedStr);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yes sir, all blue robots crossed the initiation line in auto";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Not this teim, not all blue robots crossed the initiation line in auto";
	}
	
}
