package datastructure.com.ajune;

public class Thread3 implements Runnable {
	
	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Thread3());
		t.run();
		t.run();
		t.start();
	}

}
