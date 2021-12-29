package datastructure.com.interview;

/*
 * An array is called bitonic array if it starts with numbers first Non-decreasing order
then non-increasing order, you have to find the longest length of such bitonic array for a given array
Example:
array= [10,8,9,15,12,6,7] then length of max bitonic array is 5 as [8,9,15,12,6]
array= [5,1,2,1,4,5] then length of max bitonic array is 3 as [1,2,1]
 * */

public class BitonicArray {
	
	public static void main(String[] args) {
		int[] arr= {5,1,2,1,4,5};
		int startIndex=0;
		int maxLength=0;
		do {
			int length=1;
			int i,j;
			for(i=startIndex;i<arr.length-1; i++) {
				if(arr[i] < arr[i+1]) {
					length++;
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
					continue;
				}else {
					break;
				}
			}
			if(length>maxLength) {
				maxLength=length;
			}
			startIndex++;
		}while(startIndex<arr.length);
		System.out.println(maxLength);
	}

}
