package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class BlueRobot3WillCrossAndPark extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Team "+ upcomingMatch.getBlueTeams()[2] + " will cross the initiation line in auto and PARK in endgame";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String crossStr = "";
		String parkStr = "";
		return score.getBlue().getInitLineRobot3().equalsIgnoreCase(crossStr) && score.getBlue().getEndgameRobot1().equalsIgnoreCase(parkStr);
	}

}
