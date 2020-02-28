package frc.sparx.services;

import java.lang.module.FindException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frc.sparx.bluealliance.events.Match;
import frc.sparx.bluealliance.events.MatchScore;
import frc.sparx.bluealliance.events.UpcomingMatch;
import frc.sparx.models.TriviaQuestion;
import frc.sparx.repository.TriviaQuestionRepo;
import frc.sparx.services.trivia.Blue10Lower;
import frc.sparx.services.trivia.Blue6IntoInner;
import frc.sparx.services.trivia.BlueActivateStage3;
import frc.sparx.services.trivia.BlueAllCrossInitLineAuto;
import frc.sparx.services.trivia.BlueAllianceMorePointInAuto;
import frc.sparx.services.trivia.BlueAllianceMorePointInEndgame;
import frc.sparx.services.trivia.BlueAllianceMorePointInTele;
import frc.sparx.services.trivia.BlueGet3OrMoreRP;
import frc.sparx.services.trivia.BlueGetLevelClimb;
import frc.sparx.services.trivia.BlueRobot1WillCrossAndHang;
import frc.sparx.services.trivia.BlueRobot3WillCrossAndPark;
import frc.sparx.services.trivia.FifteenBallIntoInner;
import frc.sparx.services.trivia.FiveCrossInitLineAuto;
import frc.sparx.services.trivia.FourRobotClimb;
import frc.sparx.services.trivia.GreaterThan120CominedPoints;
import frc.sparx.services.trivia.Red5Lower;
import frc.sparx.services.trivia.Red6IntoOuter;
import frc.sparx.services.trivia.RedActivateStage2;
import frc.sparx.services.trivia.RedAllCrossInitLineAuto;
import frc.sparx.services.trivia.RedAllianceMorePointInAuto;
import frc.sparx.services.trivia.RedAllianceMorePointInEndgame;
import frc.sparx.services.trivia.RedAllianceMorePointInTele;
import frc.sparx.services.trivia.RedGetLevelClimb;
import frc.sparx.services.trivia.RedGetTwoRanking;
import frc.sparx.services.trivia.RedRobot2WillNotCrossButHang;
import frc.sparx.services.trivia.RedTechnicalFoul;
import frc.sparx.services.trivia.RedWinningTeam;
import frc.sparx.services.trivia.Trivia;
import frc.sparx.services.trivia.TriviaResponse;
import frc.sparx.services.trivia.TwentyBallIntoOuter;
import frc.sparx.services.trivia.TwentyFivePenaltyPoints;
import frc.sparx.services.trivia.TwoRobotClimb;
import frc.sparx.slack.responses.Reaction;

@Service
public class TriviaService {

	@Autowired
	private SlackService slack;

	@Autowired
	private BlueAllianceService blueAllianceService;

	@Autowired
	private TriviaQuestionRepo triviaRepo;

	public void createTrivia(UpcomingMatch match) {
		int randomNum = (int)(Math.random() * 30);
		Trivia question = getTrivia(randomNum);
		String questionStr = getMatchNum(match.getMatch_key()) + ": " + question.getQuestion(match);
		triviaRepo.save(new TriviaQuestion(match.getMatch_key(), randomNum, questionStr));
	}

	private String getMatchNum(String matchKey) {
		return matchKey.split("_")[1];
	}

	public void postQuestion(MatchScore match) {
		//Post results if available
		String matchKey = match.getMatch().getComp_level() + match.getMatch().getMatch_number();
		String currentMathKey = match.getEvent_key() + "_" + matchKey;
		TriviaQuestion question = triviaRepo.findQuestionByMatchKey(currentMathKey);
		if(question != null && question.getTimestamp() == null && match.getMatch().getScore_breakdown() != null) {
			Trivia triviaQuestion = getTrivia(question.getTriviaNumber());
			TriviaResponse result = triviaQuestion.getResult(match.getMatch().getScore_breakdown());
			slack.sendMessage(matchKey + " RESULT: " + result.getMessage());
		}else {
			System.out.println("No Score Data");
		}
		
		String nextMatchKey = match.getEvent_key() + "_" + match.getMatch().getComp_level() + (match.getMatch().getMatch_number()+1);
		question = triviaRepo.findQuestionByMatchKey(nextMatchKey);
		if(question != null && question.getTimestamp() == null) {
			String timestamp = slack.sendNewTriviaQuestion(question.getTriviaQuestion());
			question.setTimestamp(timestamp);
			triviaRepo.save(question);
		}else {
			System.out.println("Unable to find previous match");
		}
	}

	public Map<String, Integer> checkwinners() {
		Map<String, Integer> correctUsers = new HashMap<String, Integer>();
		for(TriviaQuestion question: triviaRepo.findAll()){
			if(question.getTimestamp() != null) {
				Match matchResult = blueAllianceService.getDetailedMatch(question.getMatch_key());
				Reaction[] reactions = slack.getReactions(question.getTimestamp());
				Trivia trivaAnswer = getTrivia(question.getTriviaNumber());
				boolean correct = trivaAnswer.getBooleanResult(matchResult.getScore_breakdown());
				addWinningUsers(correctUsers, getCorrectUsers(correct, reactions));
			}
		}
		return userIdToName(correctUsers);
	}

	private String[] getCorrectUsers(boolean isTrue, Reaction[] reactions) {
		for(Reaction reaction: reactions) {
			if(reaction.getName().equalsIgnoreCase("+1") && isTrue) {
				return reaction.getUsers();
			}
			if(reaction.getName().equalsIgnoreCase("-1") && !isTrue) {
				return reaction.getUsers();
			}
		}
		return new String[0];
	}

	private Map<String, Integer> userIdToName(Map<String, Integer> correctUsers){
		Map<String, Integer> correctName = new HashMap<String, Integer>();
		for(String key: correctUsers.keySet()) {
			String name = slack.getUserById(key);
			correctName.put(name, correctUsers.get(key));
		}
		return correctName;
	}

	private void addWinningUsers(Map<String, Integer> map, String[] users) {
		for(String user: users) {
			if(!map.containsKey(user)) {
				map.put(user, 0);
			}
			map.put(user, map.get(user) + 1);
		}
	}

	private Trivia getTrivia(int number) {//30 questions
		switch(number) {
		case 0:
			//Red alliance Wins
			return new RedWinningTeam();
		case 1:
			//Red alliance most points in auto
			return new RedAllianceMorePointInAuto();
		case 2:
			//Blue alliance most points in auto
			return new BlueAllianceMorePointInAuto();
		case 3:
			//Red Alliance most points in teleop
			return new RedAllianceMorePointInTele();
		case 4:
			//Blue alliance most points in teleop
			return new BlueAllianceMorePointInTele();
		case 5:
			//Red alliance most points in endgame
			return new RedAllianceMorePointInEndgame();
		case 6:
			//Blue alliance most points in endgame
			return new BlueAllianceMorePointInEndgame();
		case 7:
			//Red will get 2 ranking points
			return new RedGetTwoRanking();
		case 8:
			//Blue will get 3 ranking points
			return new BlueGet3OrMoreRP();
		case 9: 
			//Red will activate stage 2;
			return new RedActivateStage2();
		case 10:
			//Blue will activate stage 3;
			return new BlueActivateStage3();
		case 11: 
			//Red alliance will get a level climb;
			return new RedGetLevelClimb();
		case 12:
			//Blue alliance will get a level climb;
			return new BlueGetLevelClimb();
		case 13: 
			//At least 2 robot will succesfully climb
			return new TwoRobotClimb();
		case 14:
			//At leaat 4 robots will succesfully climb
			return new FourRobotClimb();
		case 15: 
			//Red All robot will cross initial line in auto
			return new RedAllCrossInitLineAuto();
		case 16: 
			//Blue All robot will cross initial line in auto
			return new BlueAllCrossInitLineAuto();
		case 17:
			//At least 5 robot will cross initiation line during auto.
			return new FiveCrossInitLineAuto();
		case 18:
			//Red alliance will score at least 6 power cells into outer goal
			return new Red6IntoOuter();
		case 19:
			//Blue alliance will score at least 6 power cells into inner goal
			return new Blue6IntoInner();
		case 20:
			//At least 15 balls will be scored into the inner goal.
			return new FifteenBallIntoInner();
		case 21:
			//At least 20 balls will be scored into the outer goal
			return new TwentyBallIntoOuter();
		case 22:
			//Red will score at least 5 balls into the lower goal
			return new Red5Lower();
		case 23: 
			//Blue will score at least 10 balls into the lower goal
			return new Blue10Lower();
		case 24:
			//Blue robot 1 will cross the initiation line in auto and hang
			return new BlueRobot1WillCrossAndHang();
		case 25:
			//Red robot 2 will cross the not cross the initiation line in auto but will hang
			return new RedRobot2WillNotCrossButHang();
		case 26:
			//Blue robot 3 will cross the initiation line in auto and park
			return new BlueRobot3WillCrossAndPark();
		case 27: 
			//Red alliance will receive a technical foul.
			return new RedTechnicalFoul();
		case 28:
			//There are more then 25+ points worth of penalties
			return new TwentyFivePenaltyPoints();
		case 29:
			//Total score will be greater than 120;
			return new GreaterThan120CominedPoints();
		}
		return null;
	}

}
