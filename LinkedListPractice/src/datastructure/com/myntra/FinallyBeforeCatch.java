package datastructure.com.myntra;

public class FinallyBeforeCatch {
	
	public static void main(String[] args) {
		
		try {
			int a = 25/0;
		}
		finally {
			System.out.println("This is finally block");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
