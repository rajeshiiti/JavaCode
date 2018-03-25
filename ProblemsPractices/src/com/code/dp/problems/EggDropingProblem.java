package com.code.dp.problems;

/**
 * 
 * @author nkrajesh
 * @date 30 April, 2017
 *
 *	Problem : Given n eggs and k floor building, Using n eggs we need to find a floor in minimum number of 
 *	drops such that after that floor eggs will shatter.
 *	There are two kind of solution one recursive and another one dynamic programming
 *	Using recursive time complexity is too much
 *	While memorizing that can reduce time complexity.
 *	1. For recursive solution, recursive formula is
 *	for each h from 1 to k W[n,h] = 1 + min(W[n,h],max(drops(n-1,h-1),drops(n,k-h)));
 *
 * 	Here we are implementing Dynamic Solution
 * 	Complexity for dynamic solution is n*k*k is
 */
public class EggDropingProblem {
	
	public static void main(String[] args) {
		System.out.println(drops(2, 100));
		
	}
	
	public static int drops(int n, int k) {
		int[][] dp = new int[n+1][k+1];

		for(int i=0;i<=k;i++) {
			dp[0][i] = 0;
			dp[1][i] = i;
		}

		for(int i=0;i<=n;i++) {
			dp[i][0] = 0;
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				int mini = Integer.MAX_VALUE;
				for(int x=1;x<=j;x++) {
					mini = Math.min(mini, 1+ Math.max(dp[i][j-x], dp[i-1][x-1]));
				}
				dp[i][j] = mini;
			}
		}
		
		return dp[n][k];
		
	}
	
}
