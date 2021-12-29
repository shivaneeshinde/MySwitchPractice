package datastructure.com.dynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {
	
	public int calculateFib(int[] dp, int n){
        if(n<2){
            return dp[n];
        }
        dp[n] = calculateFib(dp,n-1)+calculateFib(dp,n-2);
        return dp[n];
    }
    public int fib(int n) {
        if(n<2)
            return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        int ans = calculateFib(dp,n);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FibonacciNumber obj = new FibonacciNumber();
		int output = obj.fib(4);
		System.out.println(output);
	}

}
