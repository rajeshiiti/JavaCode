package com.code.dp.problems;

import java.util.Scanner;

public class FiboTopDown {
	static int[] fib = new int[100];
	static int tmp = 0;
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++) 
			fib[i] = 0;
		System.out.println(getFib(n));
		System.out.println(tmp);
		inp.close();
		
	}

	private static int getFib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(fib[n]>0)
			return fib[n];
		tmp++;
		return fib[n]=getFib(n-1)+getFib(n-2);
	}

}
