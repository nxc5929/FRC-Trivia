package frc.sparx.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import frc.sparx.bluealliance.events.BaseEvent;
import frc.sparx.bluealliance.events.Event;
import frc.sparx.bluealliance.events.MatchScore;
import frc.sparx.bluealliance.events.UpcomingMatch;
import frc.sparx.services.TriviaService;
import frc.sparx.services.trivia.Trivia;

@RestController
public class BlueAllianceHook {
	
	@Autowired
	private TriviaService triviaService;
	
	@Autowired
	private ObjectMapper mapper;
	
	@PostMapping(value = "/bluealliance")
	public String newEvent(@RequestBody String payload) throws JsonMappingException, JsonProcessingException {
		BaseEvent event = mapper.readValue(payload, BaseEvent.class);
		System.out.println("New Event: " + event.getMessage_type());
		System.out.println(payload);
		if("upcoming_match".equals(event.getMessage_type())) {
			newUpcomingMatchEvent(mapper.readValue(payload, new TypeReference<Event<UpcomingMatch>>(){}));
		}else if("match_score".equals(event.getMessage_type())) {
			newUpcomingScoreEvent(mapper.readValue(payload, new TypeReference<Event<MatchScore>>(){}));
		}else {
			System.out.println(payload);
		}
		return "Ok";
	}
	
	private void newUpcomingMatchEvent(Event<UpcomingMatch> event) {
		triviaService.createTrivia(event.getMessage_data());
		
	}
	
	private void newUpcomingScoreEvent(Event<MatchScore> event) {
		triviaService.postQuestion(event.getMessage_data());
	}
	
	@GetMapping(value = "/winners")
	public Map<String, Integer> displayWinners() {
		return triviaService.checkwinners();
	}

}
