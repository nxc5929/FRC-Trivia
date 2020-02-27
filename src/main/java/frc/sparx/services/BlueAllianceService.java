package frc.sparx.services;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import frc.sparx.bluealliance.events.Match;
import frc.sparx.slack.requests.SlackMessageRequest;

@Service
public class BlueAllianceService {

	@Autowired
	private RestTemplate http;
	
	@Value("${bluealliance.getmatchURL}")
	private String matchURL;
	
	@Value("${bluealliance.token}")
	private String token;
	
	public Match getDetailedMatch(String matchKey) {
		RequestEntity request = null;
		try {
			request = RequestEntity
					.get(new URI(matchURL + "/" + matchKey))
					.header("X-TBA-Auth-Key", token)
					.build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return http.exchange(request, Match.class).getBody();
	}
	
}
