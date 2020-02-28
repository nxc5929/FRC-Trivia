package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueRobot3WillCrossAndPark extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Team "+ upcomingMatch.getBlueTeams()[2] + " will cross the initiation line in auto and PARK in endgame";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		String crossStr = "";
		String parkStr = "";
		return score.getBlue().getInitLineRobot3().equalsIgnoreCase(crossStr) && score.getBlue().getEndgameRobot1().equalsIgnoreCase(parkStr);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yes, team crossed the initiation line and parked without an issue!!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, not exactly";
	}

}
