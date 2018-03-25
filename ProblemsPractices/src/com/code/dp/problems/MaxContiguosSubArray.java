package com.code.dp.problems;

import java.util.Scanner;

public class MaxContiguosSubArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int n = inp.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) {
				a[i]  = inp.nextInt();
			}
			System.out.println(getMaxContiguosSum(a,n)+" "+getMaxNonContiguosSum(a,n));
			t--;
		}
		inp.close();
	}

	private static int getMaxNonContiguosSum(int[] a, int n) {
		int max = a[0];
		for(int i=0;i<n;i++) {
			max  = Math.max(max,Math.max(a[i], a[i]+max));
		}
		return max;
	}

	private static int getMaxContiguosSum(int[] a, int n) {
		int max_so_end = 0;
		int max_so_far = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			max_so_end = max_so_end + a[i];
			if(max_so_far<max_so_end) {
				max_so_far = max_so_end;
			}
			if(max_so_end<0) {
				max_so_end = 0;
			}
		}
		
		return max_so_far;
	}

}
