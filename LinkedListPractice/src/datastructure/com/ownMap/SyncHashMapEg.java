package datastructure.com.ownMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class SyncHashMapEg {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		ConcurrentHashMapHelper1 mapHelper1 = new ConcurrentHashMapHelper1(syncMap);
		ConcurrentHashMapHelper2 mapHelper2 = new ConcurrentHashMapHelper2(syncMap);
		ConcurrentHashMapHelper3 mapHelper3 = new ConcurrentHashMapHelper3(syncMap);

		for (Map.Entry<String, Integer> e : syncMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}
	
}
