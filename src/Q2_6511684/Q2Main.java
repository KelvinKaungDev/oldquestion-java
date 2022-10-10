package Q2_6511684;

public class Q2Main {

	public static void main(String[] args) {
		EnAMessage m1 = new EnAMessage("Hello");
		 m1.encrypt();
		 System.out.println(m1.getMessage());
		 m1.encrypt();
		 m1.printGoodFormat();
		 
		 EnBMessage mB1 = new EnBMessage("Hello");
		 mB1.encrypt();
		 System.out.println(mB1.getMessage());
		 mB1.encrypt();
		 mB1.printGoodFormat();

	}

}
