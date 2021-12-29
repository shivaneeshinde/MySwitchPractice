package datastructure.com.interview;

import java.util.*;
public class JPChaseArr {

	public static void main(String[] args) {
		int[] arr = {2,2,7,6,4,4,3,3,9,5,1};
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i=0; i<arr.length; i++) {
			ts.add(arr[i]);
		}
		int count = 0;
		int k = 4;
		for(Integer j:ts) {
			count++;
			if(count == k)
				System.out.println("expected element is: "+j);
		}
	}

}
