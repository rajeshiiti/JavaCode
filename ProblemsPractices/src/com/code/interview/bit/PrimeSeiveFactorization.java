package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeSeiveFactorization {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list = sieve(n);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		inp.close();
	}
	public static ArrayList<Integer> sieve(int a) {
		int[] prime  = new int[a+1];
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(a<=1) 
			return list;
		if(a==2) {
			list.add(2);
			return list; 
		}
		for(int i=0;i<=a;i++) {
			prime[i] = 1;
		}
		prime[0] = 0;
		prime[1] = 0;
		for(int i=2;i<=a;i++) {
			if(prime[i]==1) {
				for(int j=2;i*j<=a;j++) {
					prime[i*j] = 0;
				}
			}
		}
		for(int i=0;i<=a;i++) {
			if(prime[i]==1) {
				list.add(i);
			}
		}
		return list;
	}

}
