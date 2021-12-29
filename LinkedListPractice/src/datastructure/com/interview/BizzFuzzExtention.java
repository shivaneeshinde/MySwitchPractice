package datastructure.com.interview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BizzFuzzExtention {
	

	public static void main(String args[]) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3,"Bizz");
		map.put(5,"Fuzz");
		map.put(7,"Puzz");
		map.put(9,"Gizz");
		
		boolean flag = true;
		
		Set<Entry<Integer, String>> keys = map.entrySet();
		
		for(int i=1; i<21; i++) {	
			flag = true;
			for(Entry<Integer, String> j: keys) {
				if(i%j.getKey()==0) {
					System.out.println(j.getValue());
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}		
		}
	}

}
