package com.code.geekforgeek;

import java.util.Scanner;



public class NaturalNumberFactorialDivivdeByX {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		long x = inp.nextLong();
		System.out.println(getNaturalNumber(x));
		inp.close();
	}

	private static long getNaturalNumber(long x) {
		long tmp = x;
		for(long i=1;i<=tmp;i++) {
			if(x%gcd(x,i) == 0) {
				x = x / gcd(x,i);
			}
			
			if(x==1) {
				return i;
			}
		}
		
		return 0;
	}

	private static long gcd(long x, long i) {
		if(x%i == 0) 
			return i;
		else 
			return gcd(i,x%i);
	}
	
	

}
