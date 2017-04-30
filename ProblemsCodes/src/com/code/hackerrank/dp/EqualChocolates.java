package com.code.hackerrank.dp;

import java.util.Scanner;

public class EqualChocolates {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int n= inp.nextInt();
			int choco[] = new int[n+1];
			int min = 10000000;
			for(int i = 0;i<n;i++) {
				choco[i] = inp.nextInt();
				min = Math.min(choco[i], min);
			}
			System.out.println(getMinimumOperation(n,choco,min));
			t--;
		}

		inp.close();
	}

	private static int getMinimumOperation(int n, int[] choco, int min) {

		int sum[] = new int[6];
		for(int i=0;i<=5;i++) {
			sum[i] = 0;
			for(int j=0;j<n;j++) {
				int temp = getMod(choco[j]-(min-i));
				//System.out.println(temp);
				sum[i] = sum[i] + getValue(temp);
			}
		}
		int mini = 10000000;
		for(int i=0;i<=5;i++) {
			System.out.println(sum[i]);
			mini = Math.min(mini,sum[i]);
		}
		return mini;
	}

	private static int getMod(int i) {
		if(i>0)
			return i;
		else 
			return -1*i;
	}

	private static int getValue(int temp) {
		int k = 0;
		 k = k+ temp/5;
		 temp = temp/5;
		 k =k+ temp/2;
		 temp = temp%2;
		 k+=temp;
		 return k;
	}

}
