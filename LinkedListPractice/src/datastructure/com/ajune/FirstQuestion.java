package datastructure.com.ajune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// int array - 5 elements 
// find square of number then add 
//"11" 2 
public class FirstQuestion {
	
	public static void main(String arhs[]) {
		Integer arr[] = {11,12,43,443,5555};
		FirstQuestion obj = new FirstQuestion();
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(arr);
		int output = list.stream().mapToInt(n -> n*n).sum();
		System.out.println("Addition of square of all elements is: "+output);
		
		for(Integer x : arr) {
			int divider = obj.calculateDivider(x);
			System.out.println(divider);
			if(x/divider == 1) {
				System.out.println("This element has 1 at the 1st place: "+x);
			}
		}
	}
	
	public int calculateDivider(int num) {
		int temp = num;
		int count = 0;
		while(temp>10) {
			count++;
			temp = temp/10;
		}
		System.out.println("length of element and count is: "+count);
		int output = 1;
		while(count<0) {
			System.out.println("here");
			count--;
			System.out.println("count is: "+count);
			output = output*10;
			System.out.println("output is: "+output);
		}
		return output;
	}

}
