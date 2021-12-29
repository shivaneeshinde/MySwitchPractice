package datastructure.com.ajune;

public class Threadclass extends Thread {
	
	public Threadclass() {}
	public Threadclass(Runnable r) {
		super(r);
	}
	
	public void run() {
		System.out.println("Inside thread");
	}

}