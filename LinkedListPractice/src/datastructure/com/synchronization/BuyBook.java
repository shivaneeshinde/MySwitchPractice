package datastructure.com.synchronization;

public class BuyBook implements Runnable {
	
	private SharedProductResource sharedProductResource;
	
	public BuyBook(SharedProductResource sharedProductResource) {
		this.sharedProductResource = sharedProductResource;
	}
	
	public void run() {
		System.out.println("Buy Pen --> "+sharedProductResource.buyProduct("BOOK")); 
	}

}
