package com.code.dp.problems;

import java.util.Scanner;

/*
 * this is fibonacci bottom-up approach
 */
public class FiboBottomUp {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		System.out.println(fib[n]);
		inp.close();
	}

}
