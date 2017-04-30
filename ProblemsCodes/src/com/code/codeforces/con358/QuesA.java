package com.code.codeforces.con358;

import java.util.Scanner;

public class QuesA {
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		long a=inp.nextLong();
		long b=inp.nextLong();
		
		System.out.println(getMaxPairs(a,b));
		
	}

	private static long getMaxPairs(long a, long b) {
		long nk=0;
		long mina = Math.min(a, b);
		long maxb = Math.max(a, b);
		for(int i=1;i<=mina;i++) {
			long temp = (5-(i%5));
			if(maxb-temp<0) continue;
			else nk = nk + (maxb-temp)/5 +1;
		}
		return nk;
	}

}
