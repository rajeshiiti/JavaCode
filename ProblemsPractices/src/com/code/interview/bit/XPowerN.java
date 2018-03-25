package com.code.interview.bit;

public class XPowerN {
	public static void main(String[] args) {
		System.out.println((-1)%20+" "+pow(-1,1,20));
	}
	public static int pow(int x, int n, int d) {
		if(x==0) {
			return 0;
		} else if(n==0) {
			return 1;
		}
		int tmp =x;
		if(x<0) {
			x = -x;
		}
		int ans = (int) powOfX(x, n, d);
		if(tmp<0 && n%2==1) {
			ans = -ans;
		}
		if(ans<0) {
			return ans + d;
		}
		return (ans) % d;
	}
	public static long powOfX(long x, long n, long mod) {
		if(n==1) {
			return x %mod;
		} else {
			long half = powOfX(x, n/2, mod) % mod;
			half = (half * half ) %mod;
			if(n%2==1) {
				half = (half * x ) %mod;
			}
			return half;
		}
	}

}
