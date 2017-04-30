package com.code.interview.bit;

import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
	}
	public static int isPrime(int a) {
		if(a==0 || a==1)
			return 0;
		if(a==2)
			return 1;
		for(int i=2;i<=(int)Math.sqrt(a);i++) {
			if(a%i==0)
				return 0;
		}
		return 1;
	}

}
