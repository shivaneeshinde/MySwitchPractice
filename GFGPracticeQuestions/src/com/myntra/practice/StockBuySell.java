package com.myntra.practice;

import java.util.ArrayList;

public class StockBuySell {
	
	ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer> > list = new ArrayList<ArrayList<Integer> >();
        int buy = A[0];
        int buyIndex = 0;
        for(int i=1; i<n; i++){
            if(buy>A[i]){
                buy = A[i];
                buyIndex = i;
                continue;
            }
            else{
                int sellIndex = findSellIndex(A,i);
                ArrayList<Integer> day = new ArrayList<Integer>();
                day.add(buyIndex);
                day.add(sellIndex);
                list.add(day);
                i = sellIndex;
                if(i<n){
                    buyIndex = i++;
                    buy = A[i];
                }
            }
        }
        System.out.println("list is: "+list);
        return list;
    }
    
    public static int findSellIndex(int A[], int i){
        int sell = A[i];

        i++;
        while(sell<A[i] && i<A.length-1){
            i++;
        }
        return i-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7;
		int A[] = {100,180,260,310,40,535,695};
		
		StockBuySell ob = new StockBuySell();
		ArrayList<ArrayList<Integer> > list = ob.stockBuySell(A,N);

	}

}
