package datastructure.com.synchronization;

public class MyRunnableClass implements Runnable {
	
	public void run() {
		print();
	}
	
	public static synchronized void print() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}

}
