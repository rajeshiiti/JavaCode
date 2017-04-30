package com.code.interview.bit;

public class ClimbStairs {
	public static void main(String[] args) {
		System.out.println(climbStairs(2));
	}
	
	public static int climbStairs(int a) {
		int prev1 = 0;
		int prev2 = 1;
		int ans = 0;
		for(int i=1;i<=a;i++) {
			ans = prev1+prev2;
			prev1 = prev2;
			prev2 = ans;
		}
		return ans;
	}

}
