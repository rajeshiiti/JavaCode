package com.code.codeforces.con367;

import java.util.Scanner;

public class QB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] inpArray = new int[n];
		for(int i=0;i<n;i++) {
			inpArray[i] =input.nextInt();
		}
		int q=input.nextInt();
		int[] qArray = new int[q];
		for(int i=0;i<q;i++) {
			qArray[i] = input.nextInt();
		}

		long[] mapArray = new long[100001];
		for(int i=0;i<=100000;i++) {
			mapArray[i]=0;
		}
		for(int i=0;i<n;i++) {
			mapArray[inpArray[i]] = mapArray[inpArray[i]] + 1;
		}
		for(int i=1;i<=100000;i++) {
			mapArray[i]=mapArray[i]+mapArray[i-1];
		}

		for(int i=0;i<q;i++) {
			System.out.println(mapArray[qArray[i]]);
		}

	}

}
