package com.shivanee;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int diadiff=0;
        int n = arr.size();
        int[][] a = new int[n][n];
        int j = 0;
        for(List<Integer> in : arr){
            for(int i=0;i<in.size();i++){
                a[j][i] = in.get(i);
            }
            j++;
        }
        int k=0; int sum1=0; int sum2=0;
        while(k<n)
        {
        	System.out.println("a[k][k]: "+a[k][k]);
            sum1+=a[k][k];
            k++;
        }
        System.out.println("sum1: "+sum1);

        int m=n-1;
        for(int i=0;i<n;i++)
        {
        	System.out.println("a[i][m]: "+a[i][m]);
            sum2 += a[i][m];
            m--;
        }
        System.out.println("sum2: "+sum2);
        if(sum1>sum2)
            diadiff = sum1-sum2;
        else
            diadiff = sum2-sum1;
        return diadiff;
    }

}

public class DiaDiff {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }*/
    	List<List<Integer>> arr = new ArrayList<>();
    	List<Integer> a = new ArrayList<Integer>();
    	a.add(11);
    	a.add(2);
    	a.add(4);  	
    	arr.add(a);
    	
    	List<Integer> b = new ArrayList<Integer>();
    	b.add(4);
    	b.add(5);
    	b.add(6);  	
    	arr.add(b);
    	
    	List<Integer> c = new ArrayList<Integer>();
    	c.add(10);
    	c.add(8);
    	c.add(-12);  	
    	arr.add(c);

        int result = Result.diagonalDifference(arr);
        System.out.println("difference: "+result);

    }
}
