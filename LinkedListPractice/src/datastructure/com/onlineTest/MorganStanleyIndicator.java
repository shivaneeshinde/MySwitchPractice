package datastructure.com.onlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MorganStanleyIndicator {
	
	public static class Node{
		int val;
		int freq;
		int startIndex;
		@Override
		public String toString() {
			return "Node [val=" + val + ", freq=" + freq + ", startIndex=" + startIndex + "]";
		}
	}
	public static void main(String[] args) {
		//int[] arr= {1,2,2,2,2,3,3,3,1,1,2,2};
		int[] arr= {2,2,2,4,4,4,4,4};
		int[] arrayForConsecutive= new int[arr.length];
		for(int i=0;i<arrayForConsecutive.length;i++) {
			arrayForConsecutive[i]=1;
		}	
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1]==arr[i]) {
				arrayForConsecutive[i]=arrayForConsecutive[i-1]+1;
			}
		}
		Node n= new Node();
		List<Node> no= new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arrayForConsecutive[i]==1 && i!=0) {
				n.freq = arrayForConsecutive[i-1];
				n.val = arr[i-1];
				n.startIndex = i-n.freq+1;
				System.out.print(arr[i-1]+"("+arrayForConsecutive[i-1]+") ");
				no.add(n);
			}
			if(i==arr.length-1) {
				System.out.print(arr[i]+"("+arrayForConsecutive[i]+") ");
				n.freq = arrayForConsecutive[i];
				n.val = arr[i];
				n.startIndex= i-n.freq+1;
				no.add(n);
			}
			n= new Node();
		}
		System.out.println();
		int indicator1= no.stream().filter(x-> {return x.freq==x.val;}).collect(Collectors.toList()).size();
		System.out.println(indicator1);
		System.out.println(no); 
	}

}
