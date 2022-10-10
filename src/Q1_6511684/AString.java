package Q1_6511684;

public class AString implements Complement{
private String str;
public  AString(String str) {
this.str=str;	
}
    @Override
	public void takeComplement() {
    	int baseLower = 'a';
    	int z = 'z';
        String temp="";
        for(int i=0;i<this.str.length();i++) {
        int newc = (str.charAt(i)-baseLower)%26;
       // System.out.println(newc);
        temp += (char)(z-newc);}
        this.str=temp;
        }

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
