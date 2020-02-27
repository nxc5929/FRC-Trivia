package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwoRobotClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "AT LEAST TWO robots climb ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch) + ")";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String climbStr = "";
		int climbCount = 0;
		if(score.getRed().getEndgameRobot1().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		if(score.getRed().getEndgameRobot2().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		if(score.getRed().getEndgameRobot3().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		if(score.getBlue().getEndgameRobot1().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		if(score.getBlue().getEndgameRobot2().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		if(score.getBlue().getEndgameRobot3().equalsIgnoreCase(climbStr)) {
			climbCount++;
		}
		return climbCount >= 2;
	}

}
