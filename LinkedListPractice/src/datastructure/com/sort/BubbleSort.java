package datastructure.com.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= {10,3,7,2,5};
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("After sorting:");
		for(int k:a) {
			System.out.print(k+" ");
		}
	}

}
