package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class FifteenBallIntoInner extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "At least 15 power cells will be scored into the INNER GOAL ("+getRedAlliance(upcomingMatch)+", "+getBlueAlliance(upcomingMatch)+")";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return (score.getRed().getAutoCellsInner() + score.getRed().getTeleopCellsInner() + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner()) >= 15;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		int ballCount = score.getRed().getAutoCellsInner() + score.getRed().getTeleopCellsInner() + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner();
		return "Balls where flying! " + ballCount + " power cells made it into the inner goal!!";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		int ballCount = score.getRed().getAutoCellsInner() + score.getRed().getTeleopCellsInner() + score.getBlue().getAutoCellsInner() + score.getBlue().getTeleopCellsInner();
		return "Not this time, only " + ballCount + " power cells made it into the inner goal";
	}

}
