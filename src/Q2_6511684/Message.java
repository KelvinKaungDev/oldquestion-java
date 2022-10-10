package Q2_6511684;

public abstract class Message {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
public abstract void printGoodFormat();

public Message(String message) {
	super();
	this.message = message;
}
}
