package Q2_6511684;

public class GeneralMessage extends Message{

	public GeneralMessage(String message) {
		super(message);
		
	}

	@Override
	public void printGoodFormat() {
		System.out.println("GeneralMessage: {"+super.getMessage()+"}");
		
	}

}
