package frc.sparx.services.trivia;

import frc.sparx.bluealliance.events.ScoreBreakdown;
import frc.sparx.bluealliance.events.UpcomingMatch;

public class RedTechnicalFoul extends Trivia{

	@Override
	public String getQuestion(UpcomingMatch upcomingMatch) {
		return "Red("+getRedAlliance(upcomingMatch)+") will receive a technical penalty";
	}

	@Override
	public boolean getResult(ScoreBreakdown score) {
		return score.getRed().getTechFoulCount() > 0;
	}

}
