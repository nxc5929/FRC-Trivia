package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedTechnicalFoul extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Red("+getRedAlliance(upcomingMatch)+") will receive a technical penalty";
	}

	@Override
	public boolean getBooleanResult(ScoreBreakdown score) {
		return score.getRed().getTechFoulCount() > 0;
	}

	@Override
	public String getCorrectResponse(ScoreBreakdown score) {
		return "Sadly Correct, RED received " + score.getRed().getTechFoulCount() + " tech fouls. =(";
	}

	@Override
	public String getIncorrectResponse(ScoreBreakdown score) {
		return "Wrong, RED played a clean match";
	}

}
