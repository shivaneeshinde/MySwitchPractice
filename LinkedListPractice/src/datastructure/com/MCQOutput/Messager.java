package datastructure.com.MCQOutput;

public class Messager implements Runnable {

	public static void  main(String[] args) {
		for(int i=0;i<100;i++) {
			new Thread(new Messager("Wallace")).start();
			new Thread(new Messager("Gromit")).start();
			System.out.println("---------");
		}
		
	}
	
	private String name;
	
	public Messager(String name) {
		this.name= name;
	}
	
	public void run() {
		message(1);
		message(2);
		
	}
	public synchronized void message(int n) {
		System.out.println(name+"-"+n+" ");
	}
}
