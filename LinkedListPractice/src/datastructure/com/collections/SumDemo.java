package datastructure.com.collections;

/**
 * 
 * 1 2
 * 1
 * 
 * 1 2 3
 * 5
 * 
 * 1+2+3, 6
 * -1+2+3 4
 * 1-2+3 2 
 * 1+2-3 -1
 * 1-2-3 -4
 * -1-2-3 -6
 */

public class SumDemo {
	
	public boolean add(int[] arr, int n) {
		int temp = arr[0];
		int count =0;
		
		
		for(int i=0; i<arr.length; i++) {
			int add = 0;
			int sub = 0;
			for(int j=0; j<arr.length; j++) {
				if(i == count) {
					add+=arr[i];
					sub-=arr[i];
				}
				add += arr[i];
				sub +=arr[i];
			}
			count++;
		}
		
		
		for(int i=1; i<arr.length; i++) {
			if(temp == n) {
				return true;
			}
			else {
				if(temp+arr[i] < n) {
					temp = temp + arr[i];
				}
				else if(temp-arr[i] < 0 ) {
					temp = temp + arr[i];
				}
			}		
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumDemo sd = new SumDemo();
		int arr[] = {1,2,3};
		int n = 5;
		boolean val = sd.add(arr, n);
	}

}
