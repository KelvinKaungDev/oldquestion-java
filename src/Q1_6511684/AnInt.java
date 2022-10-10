package Q1_6511684;

public class AnInt implements Complement{
private int number;
public  AnInt(int number) {
	this.number=number; 
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
@Override
public void takeComplement() {
	int bits = Integer.toBinaryString(number).length();
    int maxBound = (int)( Math.pow(2, bits)-1);
    this.number=this.number ^ maxBound;
}

}
