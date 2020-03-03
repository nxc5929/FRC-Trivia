package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedRobot2WillNotCrossButHang extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Team "+ upcomingMatch.getRedTeams()[1] + " will NOT cross the initiation line in auto but WILL HANG";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		String notCrossStr = Constants.STAYED_INIT_LINE;
		String hangStr = Constants.CLIMBED;
		return score.getRed().getInitLineRobot2().equalsIgnoreCase(notCrossStr) && score.getRed().getEndgameRobot2().equalsIgnoreCase(hangStr);
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Yep, Robot didn't have a great auto but did make the climb!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Nope, better luck next time";
	}

}
