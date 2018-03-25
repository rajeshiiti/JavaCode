package com.code.finomena;

import java.util.Scanner;

public class SubStringProblem {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		inp.nextLine();
		while(t>0) {
		
			String str = inp.nextLine();
			int n = inp.nextInt();
			inp.nextLine();
			for(int i=1;i<=n;i++) {
				String tmp = inp.nextLine();
				subString(str, tmp);
			}
			t--;
		}
		inp.close();
	}

	private static void subString(String A, String B) {
		
		int n = A.length();
		int m = B.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			dp[i][0] = 0;
		}
		for(int i=0;i<=n;i++) {
			dp[0][i] = 0;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(B.charAt(i-1)==A.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		if(dp[m][n]<m) {
			System.out.println(-1);
			return;
		}
		int finalEnd = 0;
		int finalStart = 0;
		for(int i=n;i>=m;i--) {
			int start = 0, end = 0;
			int len = m;
			int j = i;
			while(len>0 && j>0) {
				if(B.charAt(len-1)==A.charAt(j-1)) {
					if(len==m) {
						end = j;
					}
					if(len==1) {
						start = j;
					}
					j--;
					len--;
				} else {
					j--;
				}
			}
			if(finalEnd ==0 || finalStart ==0) {
				finalEnd = end;
				finalStart = start;
			}
			if( finalEnd!=0 && finalStart!=0 && end>0 && start>0 && (finalEnd-finalStart)>=(end-start) ) {
				finalEnd = end;
				finalStart = start;
			}
		}
		System.out.println(finalStart+","+finalEnd);
	}
	

}
