package com.myntra.practice;

public class trappingWater {
	
	static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] leftIndex = new int[n];
        int[] rightIndex = new int[n];
        leftIndex[0] = arr[0];
        int ans = 0;
        for(int i=1; i<n; i++){
            leftIndex[i] = Math.max(leftIndex[i-1], arr[i]);
        }
        for(int i=0; i<n; i++){
        	System.out.print(leftIndex[i]+" "); 
        }
        System.out.println();
        rightIndex[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightIndex[i] = Math.max(rightIndex[i+1], arr[i]);
        }

        for(int i=0; i<n; i++){
        	System.out.print(rightIndex[i]+" "); 
        }
        System.out.println();
        for(int i=0; i<n; i++){
            ans = ans + Math.min(leftIndex[i],rightIndex[i])-arr[i];
        }
    return ans;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,6,2,5,4,8,3,7};
		//int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		//int arr[] = {3,0,0,2,0,4};
		int N = arr.length;
		long output = trappingWater(arr, N);
		System.out.println(output);
	}

}
