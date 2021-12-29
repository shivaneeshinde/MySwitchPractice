package datastructure.com.sort;

public class ArrayPartitioning {
	
	// 0 to j-1 <=pivot
	// j to i-1 > pivot
	public static int[] partition(int[] arr, int pivot) {
		int i=0, j=0;
		while(i<arr.length) {
			if(arr[i]>pivot) {
				i++;
			}
			else if(arr[i]<=pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pivot = 5;
		int[] arr = {7, 9, 4, 8, 3, 6, 2, 1};
		
		arr = partition(arr, pivot);
		
		System.out.println("Array after partitioning");
		
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
