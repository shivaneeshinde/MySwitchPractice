package datastructure.com.ajune;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DesOrderMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> map = new TreeMap<>();
		map.put(2, 4);
		map.put(9, 1);
		map.put(2, 3);
		map.put(2, 2);
		map.put(1, 5);
		map.put(7, 1);
		
		//Collections.sort(map);
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
