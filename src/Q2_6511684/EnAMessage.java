package Q2_6511684;

public class EnAMessage extends Message implements ICiper{
	private String message;
    public EnAMessage(String message) {
		super(message);
	    this.message=message;
	}
	@Override
	public void printGoodFormat() {
		System.out.println("Encryption B: {"+this.getMessage()+"}");
		
	}
    @Override
	public void encrypt() {
		super.setMessage(new StringBuffer(this.getMessage()).reverse().toString());
		
		
	}

}
