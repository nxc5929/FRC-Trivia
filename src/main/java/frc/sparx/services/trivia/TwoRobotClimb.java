package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class TwoRobotClimb extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "AT LEAST TWO robots climb ("+getRedAlliance(upcomingMatch)+", " + getBlueAlliance(upcomingMatch) + ")";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return getNumClimb(score) >= 2;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int numClimb = getNumClimb(score);
		return "TRUE!, " + numClimb + "/6 robots climbed!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int numClimb = getNumClimb(score);
		return "FALSE!, only" + numClimb + "/6 robots climbed";
	}
	
	private int getNumClimb(ScoreBreakdown score) {
		String climbStr = Constants.CLIMBED;
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
		return climbCount;
	}

}
