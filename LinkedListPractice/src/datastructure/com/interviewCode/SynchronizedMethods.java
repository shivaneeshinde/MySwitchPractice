package datastructure.com.interviewCode;

public class SynchronizedMethods {
	
	public static synchronized void staticMethodA() {
	    doStaticStuff();
	  }
	
	public synchronized void staticMethodB() {
	    doStaticStuff();
	  }
	
	  public static void staticMethodC() {
	    synchronized(SynchronizedMethods.class) {
	      doStaticStuff();
	    }
	  }
	  public void nonStaticMethodD() {
	    synchronized(this.getClass()) {
	      doStuff();
	    }
	  }
	  public static void unSafeStaticMethodD() {
	   doStaticStuff();
	  }
	  
	  public static void doStaticStuff() {
		  System.out.println("Static method");
	  }
	  
	  public void doStuff() {
		  System.out.println("Non-Static method");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
