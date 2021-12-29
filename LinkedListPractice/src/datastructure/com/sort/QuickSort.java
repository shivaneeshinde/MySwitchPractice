package datastructure.com.sort;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {
		//System.out.println("high is: "+high);
		//System.out.println("low is: "+low);
		if(low > high) {
			return;
		}
		int pivot = arr[high];
		int pivotIndex = partition(arr, pivot, high, low);
		quickSort(arr, low, pivotIndex-1);
		quickSort(arr, pivotIndex+1, high);
	}
	
	public static int partition(int[] arr, int pivot, int high, int low) {
		System.out.println("pivot is: "+pivot);
		int i=low, j=low;
		while(i<=high) {
			if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println("pivot index is: "+(j-1));
		return (j-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7, 9, 4, 8, 3, 6, 2, 1, 5};
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Array after partitioning");
		
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
