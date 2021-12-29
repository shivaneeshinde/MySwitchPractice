package datastructure.com.thread;

public class SynchronizedExample extends Thread {
	
	synchronized void m1()
    {
        System.out.println("In m1 A");
    }
	
    synchronized void m2()
    {
        System.out.println("In m2 A");
    }
    
    public static void main(String args[]) {
    	SynchronizedExample e = new SynchronizedExample();
    	
    	Thread t1 = new Thread(new Runnable() {
    		@Override
    		public void run() {
    			e.m1();
    		}
    	});
    	
    	Thread t2 = new Thread(new Runnable() {
    		@Override
    		public void run() {
    			e.m2();
    		}
    	});
    	
    	Thread t3 = new Thread(()-> {
    		e.m1();
    	});
    	
    	t1.start();
    	t2.start();
    	t3.start();
    }
}
