package datastructure.com.synchronization;

public class BuyPen implements Runnable {

	private SharedProductResource sharedProductResource;

	public BuyPen(SharedProductResource sharedProductResource) {
		this.sharedProductResource = sharedProductResource;
	}

	public void run() {
		System.out.println("Buy Pen --> " + sharedProductResource.buyProduct("PEN"));
	}

}
