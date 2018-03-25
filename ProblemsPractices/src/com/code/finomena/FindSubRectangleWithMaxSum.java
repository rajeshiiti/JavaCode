package com.code.finomena;

import java.util.Scanner;

public class FindSubRectangleWithMaxSum {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int m = inp.nextInt();
		int a = inp.nextInt();
		int b = inp.nextInt();
		int[][] given = new int[n+1][m+1];
		int[][] columSum = new int[n+1][m+1];
		int[][] rowSum = new int[n+1][m+1];
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=m;j++) {
				given[i][j] = inp.nextInt();
				columSum[i][j] = given[i][j];
				rowSum[i][j] = given[i][j];
			}
		}
		inp.close();
		for(int i=2;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				columSum[i][j] +=columSum[i-1][j];
			}
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=m;j++) {
				rowSum[i][j] +=rowSum[i][j-1];
			}
		}
		
		int triSum = 0;
		int preUp = 0;
		int ans = Integer.MIN_VALUE;
		for(int i=1;i<=a;i++) {
				triSum +=rowSum[i][b];
		}
		for(int i=1;i<=n-a+1;i++) {
			preUp = triSum;
			if(ans<preUp) {
				ans = preUp;
			}
			for(int j = 2;j<=m-b+1;j++) {
			int tmp = triSum - (columSum[i+a-1][j-1] - columSum[i][j-1] + given[i][j-1] ) + 
							(columSum[i+a-1][j+b-1] - columSum[i][j+b-1] + given[i][j+b-1]);
				if(tmp>ans) {
					ans = tmp;
				}
				triSum = tmp;
			}
			if(i+a<=n) {
				triSum = preUp  - rowSum[i][b] + rowSum[i+a][b];
			}
		}
		System.out.println(ans);
	}

}
