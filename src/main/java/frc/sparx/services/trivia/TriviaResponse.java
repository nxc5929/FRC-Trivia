package frc.sparx.services.trivia;

public class TriviaResponse {

	private boolean correct;
	private String message;
	
	public TriviaResponse(boolean correct, String message) {
		this.correct = correct;
		this.message = message;
	}

	public boolean isCorrect() {
		return correct;
	}

	public String getMessage() {
		return message;
	}
	
	
}
