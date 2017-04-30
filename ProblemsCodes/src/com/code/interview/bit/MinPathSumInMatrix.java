package com.code.interview.bit;

import java.util.ArrayList;

public class MinPathSumInMatrix {
	
	public static void main(String[] args) {
		/*
		 * [  1 3 2
       4 3 1
       5 6 1
    ]
		 */
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(2);
		a.add(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(3);
		l2.add(1);
		a.add(l2);
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(5);
		l3.add(6);
		l3.add(1);
		a.add(l3);
		
		System.out.println(minPathSum(a));
	}
	public static int minPathSum(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		int m = a.get(0).size();
		int[][] dp = new int[n+1][m+1];
		for(int i=1;i<=m;i++) {
			dp[1][i] = dp[1][i-1]+a.get(0).get(i-1);
		}
		for(int i=1;i<=n;i++) {
			dp[i][1] = dp[i-1][1]+a.get(i-1).get(0);
		}
		
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=m;j++) {
				dp[i][j] = a.get(i-1).get(j-1)+ Math.min(dp[i-1][j], dp[i][j-1]);
			}
		}
		return dp[n][m];
	}

}
