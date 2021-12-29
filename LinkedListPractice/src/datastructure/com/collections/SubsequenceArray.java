package datastructure.com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Input: A = {3, 1, 3, 2, 3, 4, 5, 4}, K = 5
Output: 2
Explanation: The subsequence of length 5 containing minimum number of distinct elements is {3, 3, 3, 4, 4}, consisting of 2 distinct elements, i.e. {3, 4}.
*/

public class SubsequenceArray {
	
	public int calculate(int[] arr, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1 );
			}
			else {
				map.put(arr[i], 1);
			}
		}
		List<Integer> temp = new ArrayList<>();
		
		Iterator<Integer> key = map.keySet().iterator();
		while(key.hasNext()) {
			int a = key.next();
			temp.add(map.get(a));
		}
		for(int i=0; i<temp.size()-1; i++) {
			int sum = temp.get(i);
			for(int j=i+1; j<temp.size(); j++) {
				sum += temp.get(j);
			}
		}
		
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {3, 1, 3, 2, 3, 4, 5, 4};
		int k = 4;
		SubsequenceArray sa = new SubsequenceArray();
		int output = sa.calculate(arr, k);
		System.out.println("output is: "+output);
	}

}
