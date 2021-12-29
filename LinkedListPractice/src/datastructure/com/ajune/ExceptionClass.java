package datastructure.com.ajune;

public class ExceptionClass {
	
	public static int print() {
		int c = -1;
		try {
			c = 4/0;
		}
		catch(Exception e) {
			System.err.print("exception");
		}
		finally {
			System.err.println("finally");
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = print();
	}

}
