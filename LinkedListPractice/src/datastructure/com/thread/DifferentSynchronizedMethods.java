package datastructure.com.thread;

public class DifferentSynchronizedMethods {
	int x=0;
	int y=0;
//	static {
//		System.out.println("Hello");
//		doStaticStuff();
//	}
	public DifferentSynchronizedMethods() {
		
	}
	public static synchronized void staticMethodA() {
		System.out.println("Static method A");
		
	}

	public synchronized void staticMethodB() {
		System.out.println("Static method B");
		doStaticStuff();
	}

	public static void staticMethodC() {
		System.out.println("Static method C");
		synchronized (DifferentSynchronizedMethods.class) {
			doStaticStuff();
		}
	}

	public void nonStaticMethodD() {
		System.out.println("Non-Static methodD before sleep");
		
		synchronized (this.getClass()) {
			try {
				Thread.sleep(10000);
				System.out.println("Non-Static method");
				System.out.println("X value is: "+x);
				x++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Y Value is: "+y);
		y++;
	}

	public static void unSafeStaticMethodD() {
		doStaticStuff();
	}

	public static void doStaticStuff() {
		System.out.println("Static method");
	}

	public synchronized void doStuff() {
		try {
			System.out.println("Non-Static method before sleep");
			Thread.sleep(10000);
			System.out.println("Non-Static method");
			System.out.println("X value is: "+x);
			x++;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DifferentSynchronizedMethods m= new DifferentSynchronizedMethods();
		TestClass y= new TestClass(m);
		
		Thread[] arr= new Thread[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Thread(y);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i].start();
		}
		
	}
	
}
