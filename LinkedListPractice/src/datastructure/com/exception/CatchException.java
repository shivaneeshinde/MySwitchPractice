package datastructure.com.exception;

public class CatchException {

	public static String method() throws Exception {
		try {
			System.out.println("1");
			int a = 12 / 0;
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("3");
			int a = 12 / 0;
			System.out.println("4");
		} finally {
			System.out.println("5");
		}
		return "return";
	}

	public static void main(String[] args) {
		try {
			String response = CatchException.method();
			System.out.println("response : " + response);
		} catch (Exception e) {
			System.out.println("In main method catch block");
		}
	}

}
