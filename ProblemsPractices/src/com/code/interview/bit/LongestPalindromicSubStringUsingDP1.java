package com.code.interview.bit;

public class LongestPalindromicSubStringUsingDP1 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("abb"));
	}
	public static String longestPalindrome(String a) {
		int len = a.length();
		int[][] dp = new int[len+1][len+1];
		for(int i=0;i<=len;i++) {
			for(int j=0;j<=len;j++) {
				dp[i][j] = 0;
			}
		}
		for(int i=0;i<len;i++) {
			dp[i][i] = 1;
		}
		int start = 0,end = 0;
		for(int i=0;i<len-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				dp[i][i+1] = 1;	
				if(end-start+1<2) {
					start = i;
					end = i+1;
				}
			}
		}
		
		for(int i=0;i<len-2;i++) {
			int l = 0;
			int h = 2+i;
			while(h<len) {
				if(a.charAt(l)==a.charAt(h)) {
					dp[l][h] = Math.min(dp[l+1][h-1], 1);
					if(dp[l][h]==1 && end-start+1<h-l+1) {
						start = l;
						end = h;
					}
				} else {
					dp[l][h] = 0;
				}
				l++;
				h++;
			}
		}
		return a.substring(start, end+1);
	}

}
