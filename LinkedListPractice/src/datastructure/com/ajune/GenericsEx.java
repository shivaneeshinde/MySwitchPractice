package datastructure.com.ajune;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GenericsEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(sum(list));

	}
	

	public static int sum(List<Integer> intList) {
		int sum = 0;
		for(int i: intList) {
			sum = sum + i;
		}
		return sum;
	}

}
