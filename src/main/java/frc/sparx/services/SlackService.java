package frc.sparx.services;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriBuilderFactory;
import org.springframework.web.util.UriComponentsBuilder;

import frc.sparx.slack.requests.SlackAddReaction;
import frc.sparx.slack.requests.SlackMessageRequest;
import frc.sparx.slack.responses.PostedMessageResponse;
import frc.sparx.slack.responses.ReactionResponse;
import frc.sparx.slack.responses.Reaction;
import frc.sparx.slack.responses.UserInfoResposne;

@Service
public class SlackService {
	
	@Autowired
	private RestTemplate http;
	
	@Value("${slack.urls.post}")
	private String postURL;
	
	@Value("${slack.urls.reactions}")
	private String reactionsURL;
	
	@Value("${slack.urls.addreactions}")
	private String addReactionsURL;
	
	@Value("${slack.urls.user-info}")
	private String userInfoURL;
	
	@Value("${slack.token}")
	private String token;
	
	@Value("${slack.channel}")
	private String channel;
	
	public String sendNewTriviaQuestion(String text) {
		String ts = sendMessage(text);
		addDefaultReactions(ts);
		return ts;
	}
	
	public String sendMessage(String text) {
		SlackMessageRequest message = new SlackMessageRequest(channel, text);
		HttpEntity<SlackMessageRequest> request = new HttpEntity<SlackMessageRequest>(message, getHeaders());
		
		ResponseEntity<PostedMessageResponse> response = http.postForEntity(postURL, request, PostedMessageResponse.class);
		return response.getBody().getTs();
	}
	
	private void addDefaultReactions(String ts) {
		SlackAddReaction message = new SlackAddReaction(channel, "thumbsup", ts);
		HttpEntity<SlackAddReaction> request = new HttpEntity<SlackAddReaction>(message, getHeaders());
		http.postForEntity(addReactionsURL, request, String.class);
		
		message = new SlackAddReaction(channel, "thumbsdown", ts);
		request = new HttpEntity<SlackAddReaction>(message, getHeaders());
		http.postForEntity(addReactionsURL, request, String.class);
	}
	
	public Reaction[] getReactions(String ts) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(reactionsURL)
		.queryParam("token", token)
		.queryParam("channel", channel)
		.queryParam("timestamp", ts);
		
		ResponseEntity<ReactionResponse> response = http.getForEntity(builder.toUriString(), ReactionResponse.class);
		return response.getBody().getMessage().getReactions();
	}
	
	public String getUserById(String userId) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(userInfoURL)
				.queryParam("token", token)
				.queryParam("user", userId);
		ResponseEntity<UserInfoResposne> response = http.getForEntity(builder.toUriString(), UserInfoResposne.class);
		return response.getBody().getUser().getReal_name();
	}
	
	private HttpHeaders getHeaders() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setBearerAuth(token);
		requestHeaders.add(HttpHeaders.CONTENT_TYPE, "application/json; charset=utf-8");
		return requestHeaders;
	}
}
