package frc.sparx.bluealliance.events;

public class Event<T> extends BaseEvent{

	private T message_data;

	public T getMessage_data() {
		return message_data;
	}

	public void setMessage_data(T message_data) {
		this.message_data = message_data;
	}
	
	@Override
	public String toString() {
		return getMessage_type() + " - " + message_data.toString();
	}
	
}
