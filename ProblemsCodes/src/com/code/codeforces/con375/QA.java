package com.code.codeforces.con375;

import java.util.Scanner;

public class QA {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		int b = inp.nextInt();
		int c = inp.nextInt();
		int biggg = 0,bigg = 0,big = 0;
		if(a>=b && a>=c) {
			biggg = a;
			if(b>=c) {
				bigg = b;
				big = c;
			} else {
				bigg = c;
				big = b;
			}
		} else if(b>=c && b>=a) {
			biggg = b;
			if(a>=c) {
				bigg = a;
				big = c;
			} else {
				bigg = c;
				big = a;
			}
		} else if(c>=a && c>=b) {
			biggg = c;
			if(b>=a) {
				bigg = b;
				big = a;
			} else {
				bigg = a;
				big = b;
			}
		}
		int count = 0;
		while(biggg > bigg && big < bigg) {
			biggg--;
			big++;
			count+=2;
		}
		if(big == bigg)
			count+=biggg-bigg;
		else 
			count+=bigg-big;
		System.out.println(count);
		
		
		inp.close();

	}

}
