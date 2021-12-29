package datastructure.com.ownMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEg {

	public static void main(String[] args) {
		Map<String, Integer> conMap = new ConcurrentHashMap<>();
		ConcurrentHashMapHelper1 mapHelper1 = new ConcurrentHashMapHelper1(conMap);
		ConcurrentHashMapHelper2 mapHelper2 = new ConcurrentHashMapHelper2(conMap);
		ConcurrentHashMapHelper3 mapHelper3 = new ConcurrentHashMapHelper3(conMap);

		for (Map.Entry<String, Integer> e : conMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}
	
}
