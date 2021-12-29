package datastructure.com.ajune;

public class ThreadEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Threadclass().start();
		new Threadclass(new myRunnableClass()).start();
	}

}
