package com.myntra.practice;

public class AllPalindromeSubStringDP {
	
	public static int findCount(String s) {
		int count = 0;
		boolean dp[][] = new boolean[s.length()][s.length()];
		for(int g=0; g<s.length(); g++) {
			for(int i=0, j=g; j<s.length(); j++) {
				if(g==0) {
					dp[i][j] = true;
//					String cur = s.substring(i, j);
//					System.out.println(cur);
				}
				else if(g==1) {
					dp[i][j] = s.charAt(i) == s.charAt(j);
//					String cur = s.substring(i, j);
//					System.out.println(cur);
				}
				else {
					if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]==true) {
//						String cur = s.substring(i, j);
//						System.out.println(cur);
						dp[i][j] = true;
					}
				}
				if(dp[i][j]==true) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abccbc";
		String s = "abab";
		int count = findCount(s);
		System.out.println(count);
	}

}
