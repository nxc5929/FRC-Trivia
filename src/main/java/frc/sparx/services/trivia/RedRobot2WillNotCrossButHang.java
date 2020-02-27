package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedRobot2WillNotCrossButHang extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Team "+ upcomingMatch.getRedTeams()[1] + " will NOT cross the initiation line in auto but WILL HANG";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		String crossStr = "";
		String hangStr = "";
		return !score.getRed().getInitLineRobot2().equalsIgnoreCase(crossStr) && score.getRed().getEndgameRobot2().equalsIgnoreCase(hangStr);
	}

}
