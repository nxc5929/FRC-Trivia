package frc.sparx.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class TriviaQuestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String timestamp;
	private String match_key;
	private int triviaNumber;
	private String triviaQuestion;
	
	public TriviaQuestion() {}
	
	public TriviaQuestion(String match_key, int triviaNumber, String triviaQuestion) {
		this.match_key = match_key;
		this.triviaNumber = triviaNumber;
		this.triviaQuestion = triviaQuestion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getMatch_key() {
		return match_key;
	}
	public void setMatch_key(String match_key) {
		this.match_key = match_key;
	}
	public int getTriviaNumber() {
		return triviaNumber;
	}
	public void setTriviaNumber(int triviaNumber) {
		this.triviaNumber = triviaNumber;
	}
	public String getTriviaQuestion() {
		return triviaQuestion;
	}
	public void setTriviaQuestion(String triviaQuestion) {
		this.triviaQuestion = triviaQuestion;
	}
	
}
