package datastructure.com.ownMap;

import java.util.Map;

public class ConcurrentHashMapHelper1 implements Runnable {
	Map<String, Integer> map;

	public ConcurrentHashMapHelper1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "ConcurrentHashMapHelper1").start();
	}

	public void run() {
		map.put("One", 1);
		try {
			System.out.println("ConcurrentHashMapHelper1 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}