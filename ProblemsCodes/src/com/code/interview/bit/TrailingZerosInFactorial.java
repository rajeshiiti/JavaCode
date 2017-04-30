package com.code.interview.bit;

public class TrailingZerosInFactorial {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(10));
	}
	public static int trailingZeroes(int a) {
		int ans = 0 ;
		int tmp = 5;
		while(tmp<=a) {
			ans = ans + (a/tmp);
			tmp = tmp * 5;
		}
		return ans;
	}

}
