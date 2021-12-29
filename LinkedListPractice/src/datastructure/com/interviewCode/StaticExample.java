package datastructure.com.interviewCode;

public class StaticExample {
	
	static {
		System.out.println("This is static block");
	}
	
	public StaticExample() {
		System.out.println("This is default constructor");
	}
	
	public void print() {
		System.out.println("This is non-static method");
	}
	
	public static void printStatic() {
		System.out.println("This is static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample s = new StaticExample();
		s.print();
		printStatic();
	}

}
