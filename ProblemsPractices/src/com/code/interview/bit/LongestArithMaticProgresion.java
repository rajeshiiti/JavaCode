package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestArithMaticProgresion {
	public static void main(String[] args) {

	}

	public int solve(final List<Integer> A) {
		if(A.size()<=2) {
			return A.size();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<A.size();i++) {
			list.add(A.get(i));
		}
		int n = A.size();
		Collections.sort(list);
		int[][] dp = new int[A.size()][A.size()];
		for(int i=0;i<list.size();i++) {
			dp[i][n-1] = 2;
		}
		int ans = 2;
		for(int j=n-2;j>=0;j--) {
			int i  = j-1;
			int k = j+1;
			while(i>=0 && k<n) {
				if(list.get(i)+list.get(k)<2*list.get(j)) {
					k++;
				} else if(list.get(i)+list.get(k)>2*list.get(j)) {
					dp[i][j] = 2;
					i--;
				} else {
					dp[i][j] = dp[j][k] +1;
					ans = Math.max(ans, dp[i][j]);
					i--;
					k++;
				}
			}
			while(i>=0) {
				dp[i][j] = 2;
				i--;
			}
		}
		return ans;

	}

}
