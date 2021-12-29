package datastructure.com.synchronization;

import java.util.HashMap;

public class SharedProductResource {
	
	private HashMap<String, Integer> products = new HashMap<>();
	
	public SharedProductResource() {
		products.put("PEN",10);
		products.put("BOOK",1);
		products.put("CYCLE",2);
		products.put("CAMERA",5);
		products.put("COAT",1);
	}
	
	public synchronized String buyProduct(String productName) {
		if(products.containsKey(productName)) {
			int quantity = products.get(productName);
			if(quantity>0) {
				products.put(productName,quantity-1);
				return "Successful!! "+productName+" is out for delivery to "+ Thread.currentThread().getName();
			}
		}
		return "Product is out of stock "+Thread.currentThread().getName();
	}

}
