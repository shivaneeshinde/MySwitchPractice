package datastructure.com.synchronization;

public class StaticSynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Thread t1 = new Thread(new MyRunnableClass(),"test1");
		Thread t2 = new Thread(new MyRunnableClass(),"test2");
		t1.start();
		t2.start();

	}

}
