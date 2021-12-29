package datastructure.com.sort;

public class MergeSort {
	
	public static int[] mergeSort(int[] arr, int low, int high) {
		if(low == high){
			int[] bArr = new int[1];
			bArr[0] = arr[low];
			return bArr;
		}
		int mid = (low + high)/2;
		int[] firsthalf = mergeSort(arr, low, mid);
		int[] secondhalf = mergeSort(arr, mid+1, high);
		int[] mergeArr = mergeSortedArr(firsthalf, secondhalf);
		return mergeArr;
	}
	
	public static int[] mergeSortedArr(int[] firsthalf, int[] secondhalf) {
		int i = 0;
		int j = 0;
		int arr[] = new int[firsthalf.length+secondhalf.length];
		int k = 0;
		while(i<firsthalf.length && j<secondhalf.length) {
			if(firsthalf[i]>secondhalf[j]) {
				arr[k] = secondhalf[j];
				j++;
			}
			else {
				arr[k] = firsthalf[i];
				i++;
			}
			k++;
		}
		while(i<firsthalf.length) {
			arr[k] = firsthalf[i];
			i++;
			k++;
		}
		while(j<secondhalf.length) {
			arr[k] = secondhalf[j];
			j++;
			k++;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 9, 4, 8, 3, 6, 2, 1, 5};
		
		arr = mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Array after partitioning");
		
		for(int x:arr) {
			System.out.print(x+" ");
		}

	}

}
