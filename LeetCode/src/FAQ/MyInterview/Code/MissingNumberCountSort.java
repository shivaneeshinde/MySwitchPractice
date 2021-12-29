package FAQ.MyInterview.Code;

import java.util.Arrays;

public class MissingNumberCountSort {
	
	public int findMissing(int[] arr) {
		int[] countArr = new int[arr.length+2];
		Arrays.fill(countArr, 0);
		for(int i=0; i<arr.length; i++) {
			countArr[arr[i]]++;
		}
		for(int i=1; i<=arr.length+1; i++) {
			if(countArr[i]==0)
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,7};
		
		MissingNumberCountSort obj = new MissingNumberCountSort();
		int num = obj.findMissing(arr);
		System.out.println(num);

	}

}
