package datastructure.com.MCQOutput;

public class ErrorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			badMethod();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("b");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	public static void badMethod() {
		throw new Error();
	}


}
