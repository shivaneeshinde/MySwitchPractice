package com.myntra.practice;

public class LeftSideSmallerRightSideGreater {
	
	public int findElement(int arr[], int n){
        // leftMax[i] stores maximum of arr[0..i-1]
              int[] leftMax = new int[n];
              leftMax[0] = Integer.MIN_VALUE;
 
              // Fill leftMax[]1..n-1]
              for (int i = 1; i < n; i++){
                  System.out.println("leftMax i-1 is: "+leftMax[i - 1]);
                  System.out.println("arr i-1 is: "+arr[i - 1]);
                  leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
              }
                   
            System.out.println("leftMax array is:");
            
            for (int i = 0; i < n; i++)
                System.out.print(i+" : "+leftMax[i]+" , ");
                   
            System.out.println(); 
              // Initialize minimum from right
              int rightMin = Integer.MAX_VALUE;
 
              // Traverse array from right
              for (int i = n - 1; i >= 0; i--)
              {
                  System.out.println("leftMax i is: "+leftMax[i]);
                  System.out.println("arr i is: "+arr[i]);
                  System.out.println("rightMin is: "+rightMin);
                   // Check if we found a required element
                   if (leftMax[i] < arr[i] && rightMin > arr[i])
                	   return arr[i-1];
 
                   // Update right minimum
                   rightMin = Math.min(rightMin, arr[i]);
                   System.out.println("condition is not true so rightMin is: "+rightMin);
              }
                
              // If there was no element matching criteria
              return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		//int[] arr = {6, 1, 10};
        int n = arr.length;
		LeftSideSmallerRightSideGreater ob = new LeftSideSmallerRightSideGreater();
		int output = ob.findElement(arr, n);
		System.out.println("req output is: "+output);
	}

}
