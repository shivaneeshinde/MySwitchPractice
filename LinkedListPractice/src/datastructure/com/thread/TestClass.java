package datastructure.com.thread;

public class TestClass implements Runnable {

	DifferentSynchronizedMethods m;

	public TestClass(DifferentSynchronizedMethods m) {
		this.m = m;
	}

	@Override
	public void run() {
			
			System.out.println("Inside run");
			m.nonStaticMethodD();
			//m.doStuff();	
	}

}
