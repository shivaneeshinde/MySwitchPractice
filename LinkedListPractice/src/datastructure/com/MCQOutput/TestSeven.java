package datastructure.com.MCQOutput;

public class TestSeven extends Thread{

	private static int x;
	
	public synchronized void doThings() {
		int current =x;
		current++;
		x=current;
	}
	public void run() {
		synchronized (this) {
			doThings();
		}
		
		System.out.println(x);
	}
	
	public static  void  main(String[] args) {
		for(int i=0;i<100;i++) {
			new Thread(new TestSeven()).start();
		}
		
	}
}
