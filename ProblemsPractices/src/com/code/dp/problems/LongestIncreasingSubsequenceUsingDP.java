package com.code.dp.problems;

public class LongestIncreasingSubsequenceUsingDP {

	public static void main(String[] args) {
		int[] A = {2,4,6,1,2,9};
		System.out.println(lis(A));
	}

	public static int lis(int[] A) {
		int len = A.length;
		if(len<=1) {
			return len;
		}
		int[] dp = new int[len+1];
		for(int i=0;i<len;i++) {
			dp[i] = 1;
		}

		for(int i=1;i<len;i++) {
			for(int j=0;j<i;j++) {
				if(A[i]>A[j] && dp[i]<1+dp[j]) {
					dp[i] =dp[j] + 1;
				}
			}
		}

		return dp[len-1];
	}

}
