package datastructure.com.thread;

public class OddEvenThread extends Thread {
	int counter = 1;
	private static int N = 10;
	
	public void printOdd() {
		System.out.println("inside odd");
		synchronized (this) {		
			while(counter <= N) {		
				if(counter%2 == 0) {
					try {
						System.out.println("waiting now");
						wait();
					} catch(Exception e) {
						System.out.println("Exception occured at t1: "+e);
					}
				}
				System.out.println("Printing t1 odd thread: "+counter);
				counter++;
				// Notify to evenPrint thread
				notify();
			}		
		}
	}
	
	public void printEven() {
		System.out.println("inside even");
		synchronized (this) {
			while(counter <= N) {	
				System.out.println("after making odd wait came here");
				if(counter%2 != 0) {
					try {
						wait();
					} catch (Exception e) {
						System.out.println("Exception occured at t2: "+e);
					}		
				}
				System.out.println("Printing t2 even thread: "+counter);
				counter++;
				// Notify to oddPrint thread
				notify();
			}
		}
	}
	
	public static void main(String args[]) {	
		OddEvenThread oe = new OddEvenThread();
		
		/*Thread t1 = new Thread(new Runnable() {		
			@Override
			public void run() {
				oe.printOdd();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				oe.printEven();
			}
		});*/
		
		Thread t1 = new Thread(()->{oe.printOdd();});
		Thread t2 = new Thread(()->{oe.printEven();});
		
		t1.start();
		t2.start();
	}

}
