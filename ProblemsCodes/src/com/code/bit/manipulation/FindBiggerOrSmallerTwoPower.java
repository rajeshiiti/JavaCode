package com.code.bit.manipulation;

public class FindBiggerOrSmallerTwoPower {
	public static void main(String[] args) {
		int num = 16;
		int tmp = num;
		int big = 1 ;
		while(tmp>0) {
			tmp = tmp >> 1;
			big = big << 1;
		}
		System.out.println("Bigger: "+ big);
		System.out.println("Smaller: "+ (big>>1));
	}

}
