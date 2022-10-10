package Q1_6511684;

public class Q1Main {

	public static void main(String[] args) {
		Complement anInt=new AnInt(12);
		anInt.takeComplement();
		System.out.println(((AnInt)anInt).getNumber());
		System.out.println(2*((AnInt)anInt).getNumber());
		/////////////////////////////////////
		Complement aString=new AString("abc");
		aString.takeComplement();
		System.out.println(((AString)aString).getStr());
		/////////////////////////////////////////////////
		Complement aString1=new AString("byebye");
		aString1.takeComplement();
		System.out.println(((AString)aString1).getStr());

	}

}
