package com.code.codeforces.con369;

import java.util.Scanner;

public class QB2 {
	public static void main(String[] args) {
		Scanner inp  = new Scanner(System.in);
		long n=inp.nextLong();
		long[][] mgSquare = new long[(int) n][(int) n];
		int i1=-1,j1=-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mgSquare[i][j] = inp.nextLong();
				if(mgSquare[i][j]==0) {
					i1=i;
					j1=j;
				}
			}
		}
		if(n==1) {
			System.out.println(1);
			return;
		}
		if(j1==n-1) {
			checkTwoColumnSum(i1,j1,j1-1,n,mgSquare);
		} else {
			checkTwoColumnSum(i1,j1,j1+1,n,mgSquare);
		}
	}

	private static void checkTwoColumnSum(int i1,int j1, int j2,long n, long[][] mgSquare) {
		long sum1=0,sum2=0;
		for(int i=0;i<n;i++) {
			sum1=sum1+mgSquare[i][j1];
			sum2=sum2+mgSquare[i][j2];
		}
		if(sum1<sum2) {
			mgSquare[i1][j1]=sum2-sum1;
			if(checkAllSum(sum2,mgSquare,n)) {
				System.out.println(mgSquare[i1][j1]);
				return;
			}
		}
		System.out.println(-1);
		
	}

	private static boolean checkAllSum(long sum2, long[][] mgSquare, long n) {
		long lDigonal=0,rDigonal=0;
		for(int i=0;i<n;i++) {
			long rSum=0,cSum=0;
			for(int j=0;j<n;j++) {
				rSum=rSum+mgSquare[i][j];
				cSum=cSum+mgSquare[j][i];
			}
			if(rSum!=sum2 || cSum!=sum2)
				return false;
			lDigonal=lDigonal+mgSquare[i][i];
			rDigonal=rDigonal+mgSquare[i][(int) (n-1-i)];
		}
		if(lDigonal!=sum2 || rDigonal!=sum2)
			return false;
		return true;
	}


}
