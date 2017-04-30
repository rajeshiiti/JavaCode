package com.code.interview.bit;

import java.util.ArrayList;

public class TextJustificationUsingDP {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("what");
		list.add("must");
		list.add("be");
		list.add("shall");
		list.add("be.");
		ArrayList<String> ans = fullJustify(list, 12);
	}

	private static ArrayList<String> fullJustify(ArrayList<String> list, int b) {
		int size = list.size();
		int[][] dp = new int[size][size];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				dp[i][j] = 0;
			}
		}
		for(int i=0;i<size;i++) {
			int len = 0;
			for(int j=i;j<size;j++) {
				len+=list.get(j).length();
				if(len>b) {
					dp[i][j] = -1;
				} else {
					dp[i][j] = (b-len)*(b-len);
					len+=1;
				}
			}
		}
		int[] lineDP = new int[size+1];
		int[] index  = new int[size];
		for(int i=0;i<size;i++) {
			lineDP[i] = dp[i][i];
			
		}
		lineDP[size-1] = dp[size-1][size-1];
		lineDP[size] = 0;
		index[size-1] = size;
		for(int i=size-1;i>=0;i--) {
			int min = Integer.MAX_VALUE;
			for(int j=i;j<size;j++) {
				if(dp[i][j]>=0 && min>dp[i][j]+lineDP[j+1]) {
					min =dp[i][j]+lineDP[j+1];
					System.out.println(i+" "+j+" "+min+" "+dp[i][j]+" + "+lineDP[j+1]);
					lineDP[i] = min;
					index[i] = j+1;
				}
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

}
