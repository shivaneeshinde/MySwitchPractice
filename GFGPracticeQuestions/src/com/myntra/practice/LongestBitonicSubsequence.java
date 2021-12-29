package com.myntra.practice;

public class LongestBitonicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 5, 3, 2};
		int startIndex=0;
		int maxLength=0;
		do {
			int length=1;
			int i,j;
			
			for(i=startIndex;i<arr.length-1; i++) {
				if(arr[i] < arr[i+1]) {
					length++;
					System.out.print("(arr[i], arr[i+1]) =>"+arr[i]+", "+arr[i+1]);
					System.out.print("\t"+length+"");
					System.out.println();
					continue;
				}else {
					length++;
					break;
				}
			}
			if(length==arr.length) {
				maxLength= length;
				break;
			}
			for(j=i+1;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					length++;
					System.out.print("(arr[j], arr[j+1]) =>"+arr[j]+", "+arr[j+1]);
					System.out.print("\t"+length+"");
					System.out.println();
					continue;
				}else {
					break;
				}
			}
			if(length>maxLength) {
				maxLength=length;
			}
			
			startIndex++;
			System.out.println("Length: "+length);
		}while(startIndex<arr.length);
		System.out.println(maxLength);
	}

}
