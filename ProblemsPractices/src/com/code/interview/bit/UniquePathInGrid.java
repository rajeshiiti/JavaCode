package com.code.interview.bit;

import java.util.ArrayList;

public class UniquePathInGrid {
	
	public static void main(String[] args) {
		/*
		 * A : 
[0, 0, 1, 0]
  [0, 1, 1, 1]
  [0, 0, 1, 1]
  [0, 1, 0, 1]
  [0, 0, 0, 0]
		 */
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(0);
		l1.add(0);
		l1.add(1);
		l1.add(0);
		a.add(l1);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(0);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		a.add(l2);
		
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(0);
		l3.add(0);
		l3.add(1);
		l3.add(1);
		a.add(l3);
		
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		l4.add(0);
		l4.add(1);
		l4.add(0);
		l4.add(1);
		a.add(l4);
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.add(0);
		l5.add(0);
		l5.add(0);
		l5.add(0);
		a.add(l5);
		
		System.out.println(uniquePathsWithObstacles(a));
	}
	
	
	public static int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> a) {
		
		int n = a.size();
		int m = a.get(0).size();
		
		int[][] dp = new int[n+1][m+1];
		
		int val =1;
		
		for(int i=1;i<=m;i++) {
			if(a.get(0).get(i-1) == 1) {
				val =0;
			}
			dp[1][i] = val;
		}
		val =1;
		for(int i=1;i<=n;i++) {
			if(a.get(i-1).get(0) ==1) {
				val =0;
			}
			dp[i][1] = val;
		}
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=m;j++) {
				if(a.get(i-1).get(j-1)==0) {
					dp[i][j] = dp[i-1][j] +dp[i][j-1];
				}
			}
		}
		return dp[n][m];
	}

}
