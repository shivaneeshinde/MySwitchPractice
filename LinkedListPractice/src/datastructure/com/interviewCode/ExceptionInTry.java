package datastructure.com.interviewCode;


public class ExceptionInTry {
	
	public int myMethod() {
		int x = 10;
		try {
			String s = null;
			throw new NullPointerException();		
		}
		catch(NullPointerException nullPointerException){
			//throw new NullPointerException();
			return x;
		}
		finally {
			//throw new NumberFormatException();
			x = 2;
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionInTry demo = new ExceptionInTry();
		int a = demo.myMethod();
		System.out.println(a);

	}

}
