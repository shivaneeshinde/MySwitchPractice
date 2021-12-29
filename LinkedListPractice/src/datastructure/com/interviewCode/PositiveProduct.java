package datastructure.com.interviewCode;

public class PositiveProduct {

	public static void main(String[] args) {
		
		int arr[] = {1,-2,-3,4}; // output: 4
		int arr1[] = {-3,5}; // output : 1
		
		int PosCount = 0;
		int NegCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				PosCount++;
			}
			else if(arr[i]<0) {
				NegCount++;
			}
		}
		NegCount = (NegCount%2 == 0) ? NegCount : NegCount-1;
		
		int count = PosCount + NegCount;
		
		System.out.println(count);
	}

}
