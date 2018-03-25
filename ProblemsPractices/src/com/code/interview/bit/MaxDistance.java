package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDistance {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		System.out.println(maximumGap(array));
	}
	public static int maximumGap(final List<Integer> a) {
		int n = a.size();
		int[] lMin = new int[n];
		int[] rMax = new int[n];
		lMin[0] = a.get(0);
		for(int i = 1;i<n;i++) {
			lMin[i] = Math.min(lMin[i-1], a.get(i));
		}
		rMax[n-1] = a.get(n-1);
		for(int i=a.size()-2;i>=0;i--) {
			rMax[i] = Math.max(rMax[i+1], a.get(i));
		}
		int ans = -1;
		int i=0;
		int j =0;
		while(i<n && j<n) {
			if(lMin[i]<rMax[j]) {
				ans = Math.max(ans, j-i);
				j+=1;
			} else {
				i+=1;
			}
		}
		return ans;
	}

}
