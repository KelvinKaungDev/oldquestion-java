package Q2_6511684;

public class HiddenInt implements ICiper  {
    private int number;
	@Override
	public void encrypt() {
		System.out.println(Integer.toBinaryString(this.number));  
		
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

}
