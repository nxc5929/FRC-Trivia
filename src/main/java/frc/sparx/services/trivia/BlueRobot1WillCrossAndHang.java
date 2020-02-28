package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueRobot1WillCrossAndHang extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Team "+ upcomingMatch.getBlueTeams()[0] + " will cross the initiation line in auto and hang";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		String crossStr = "";
		String hangStr = "";
		return score.getBlue().getInitLineRobot1().equalsIgnoreCase(crossStr) && score.getBlue().getEndgameRobot1().equalsIgnoreCase(hangStr);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yes, team crossed the initiation line and climbed without an issue!!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, better luck next time!";
	}

}
