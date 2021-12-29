package datastructure.com.MCQOutput;

public class Tes {
	
	public static void main(String[] args) {
		try {
			throw new Ex1();
		}
		catch(Ex0 e) {
			System.out.println("Ex0 caught");
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
	}
}
