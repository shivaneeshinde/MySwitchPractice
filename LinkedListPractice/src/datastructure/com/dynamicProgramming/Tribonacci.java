package datastructure.com.dynamicProgramming;

import java.util.Arrays;

public class Tribonacci {
	
    public int findSumOfNElements(int[] dp, int n){
        if(n<0){
            return 0;
        }
        else{
            return (dp[n]+findSumOfNElements(dp,n-1));
        }
    }
    
    public int findNElements(int[] dp, int n){
        if(n<2)
            return dp[n];
        dp[n] = findNElements(dp,n-1) + findNElements(dp,n-2);
        return dp[n];
    }
    
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        findNElements(dp,n);
        int sum = 0;
        sum = findSumOfNElements(dp,n-1);
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tribonacci obj = new Tribonacci();
		int output = obj.tribonacci(7);
		System.out.println(output);
	}

}
