package datastructure.com.ownMap;

import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		MyHashMap<String, String> map = new MyHashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		map.put("D", "4");
		map.put("E", "5");
		map.put("F", "6");
		map.put("G", "7");
		map.put("H", "8");

		MyHashMap<ConcurrentHashMapHelper1, String> map1 = new MyHashMap<>();
		map1.put(new ConcurrentHashMapHelper1(null), "sh");
		
		System.out.println("value for key A is: "+map.get("A"));
		System.out.println("Printing Hashmap: "+map.toString());
		map.remove("A");
		System.out.println("Printing Hashmap after removing key A: "+map.toString());
		Map<Integer, Integer> mapBuild = new HashMap<>();
		mapBuild.put(1, 1);
	}

}
