package datastructure.com.ownMap;

import java.util.Map;

public class ConcurrentHashMapHelper2 implements Runnable {
	Map<String, Integer> map;

	public ConcurrentHashMapHelper2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "ConcurrentHashMapHelper2").start();
	}

	public void run() {
		map.put("Two", 2);
		try {
			System.out.println("ConcurrentHashMapHelper2 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}