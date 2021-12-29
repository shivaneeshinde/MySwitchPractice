package datastructure.com.ajune;

public class ErrorProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			badmethod();
			System.out.println("A");
		}
		catch(Exception e) {
			System.out.println("B");
		}
		finally{
			System.out.println("c");
		}
		System.out.println("D");
	}
	
	public static void badmethod() {
		throw new Error();
	}

}
