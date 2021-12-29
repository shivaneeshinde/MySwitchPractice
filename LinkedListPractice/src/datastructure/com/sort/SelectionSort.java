package datastructure.com.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,3,7,2,5};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("After sorting:");
		for(int k:a) {
			System.out.print(k+" ");
		}
		
	}

}
