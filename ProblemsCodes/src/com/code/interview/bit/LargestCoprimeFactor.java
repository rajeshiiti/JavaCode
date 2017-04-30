package com.code.interview.bit;

import java.util.ArrayList;

public class LargestCoprimeFactor {
	public static void main(String[] args) {
		System.out.println(cpFact(74, 22));
	}
	public static int cpFact(int A, int B) {
		ArrayList<Integer> devisor = new ArrayList<Integer>();
		devisor.add(A);
		for(int i=2;i<=Math.sqrt(A);i++) {
			if(A%i==0) {
				devisor.add(i);
				devisor.add(A/i);
			}
		}
		int bigOne = 1;
		for(Integer inte:devisor) {
			if(gcd(inte,B)==1) {
				bigOne = Math.max(bigOne, inte);
			}
		}
		return bigOne;
		
    }
	private static int gcd(int a, int b) {
		if(b==0)
			return a;
		else if(a%b==0) {
			return b;
		} else {
			return gcd(b,a%b);
		}
	}

}
