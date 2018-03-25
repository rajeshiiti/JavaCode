package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingDecreasingSubSequence {
	public static void main(String[] args) {
		// 1 11 2 10 4 5 2 1
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(11);
		list.add(2);
		list.add(10);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(1);
		System.out.println(longestSubsequenceLength(list));
	}
	
	public static int longestSubsequenceLength(final List<Integer> A) {
		int n = A.size();
		int[] forward = new int[n];
		int[] backward = new int[n];
		for(int i=0;i<n;i++) {
			forward[i] = 1;
			backward[i] = 1;
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(forward[j]+1>forward[i] && A.get(j)<A.get(i)) {
					forward[i] = forward[j] +1 ;
				}
			}
		}
		
		for(int i=n-2;i>=0;i--) {
			for(int j=n-1;j>i;j--) {
				if(backward[j]+1>backward[i] && A.get(j)<A.get(i)) {
					backward[i] = backward[j] +1 ;
				}
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++) {
			ans = Math.max(ans, forward[i]+backward[i]-1);
		}
		
		return ans;
    }

}
