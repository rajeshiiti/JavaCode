package com.code.interview.bit;

public class ModularPower {
	public static void main(String[] args) {
		System.out.println(mod(2,5,7));
	}
	
	public static int mod(int a, int b, int c) {
		return (int)modular(a,b,c);
	}

	private static long modular(int a, int b, int c) {
		if(b==0) {
			return 1;
		}
		if(b==1) {
			return a % c;
		} else {
			long tmp = modular(a,b/2,c) % c;
			tmp = (tmp * tmp ) % c;
			if(b%2==1) {
				tmp = ( tmp * a ) % c;
			}
			return tmp;
		}
	}

}
