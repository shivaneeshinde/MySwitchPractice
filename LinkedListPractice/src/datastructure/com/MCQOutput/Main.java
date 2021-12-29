package datastructure.com.MCQOutput;

public class Main {
	public static void doPrint(Base o) {
		o.print();
	}
	public static void main(String[] args) {
		Base x= new Base();
		Base y= new Derived();
		Derived z= new Derived();
		doPrint(x);
		doPrint(y);
		doPrint(z);
	}
	
}
