package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumJum {
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(0);
		a.add(1);
		a.add(0);
		a.add(2);
		a.add(0);
		a.add(4);
		System.out.println(jump(a));
	}
	
	public static int jump(ArrayList<Integer> a) {
		if(a == null && a.size()<=1) {
			return 0;
		}
		int[] A = new int[a.size()];
		for(int i=0;i<a.size();i++) {
			A[i] = a.get(i);
		}
		return jump(A);
		 /**int[] dp = new int[a.size()];
		dp[0] = 0;
		for(int i=1;i<a.size();i++) {
			dp[i] =Integer.MAX_VALUE;
			for(int j=0;j<i;j++) {
				if(i<=j+a.get(j) && dp[j]<Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[j]+1, dp[i]);
				}
			}
		}
		return dp[a.size()-1]; */
	}
	public static int jump(int[] A) {
        int maxReach = A[0];
        int step = A[0];
        int jump = 1;
        for (int i = 1; i < A.length; i++) {
            if (i + A[i] > maxReach)
                maxReach = i + A[i];
            step--;
            if (step == 0) {
                jump++;
                step = maxReach - i;
            }
            if(step ==0 && i<A.length-1) {
            	return -1;
            }
        }
        return jump;
    }

}
