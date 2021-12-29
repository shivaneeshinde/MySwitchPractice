package datastructure.com.ownMap;

import java.util.Map;

public class ConcurrentHashMapHelper3 implements Runnable {
	Map<String, Integer> map;

	public ConcurrentHashMapHelper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "ConcurrentHashMapHelper3").start();
	}

	public void run() {
		map.put("Three", 3);
		try {
			System.out.println("ConcurrentHashMapHelper3 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}