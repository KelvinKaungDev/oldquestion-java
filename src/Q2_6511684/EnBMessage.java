package Q2_6511684;

public class EnBMessage extends Message implements ICiper{
    private String message;
	public EnBMessage(String message) {
		super(message);
		this.message=message;
	}

	@Override
	public void printGoodFormat() {
		System.out.println("Encryption A: {"+this.message+"}");
		
	}
    @Override
	public void encrypt() {
		int baseLower = 'a';
    	int z = 'z';
        String temp="";
        for(int i=0;i<this.message.length();i++) {
        int newc = (this.message.charAt(i)-baseLower+2)%26;
        temp += (char)(newc+baseLower);}
        super.setMessage(temp);	
	}

}
