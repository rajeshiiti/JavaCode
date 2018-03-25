package com.code.interview.bit;

import java.util.List;

public class Number2 {
	public static void main(String[] args) {
		int A[] = new int[7];
		A[0] =1;A[1] =2;A[2] =1;
		A[3] =2;A[4] =2;A[5] =1;
		A[6] =3;
		System.out.println(singleNumber(A,7));
		
	}
	// DO NOT MODIFY THE LIST
	public static int singleNumber(final List<Integer> a) {
		int[] index = new int[20];
		for(int i=0;i<20;i++) {
			index[i] = 0;
		}
		for(int i=0;i<a.size();i++) {
			int tmp = a.get(i);
			int j=19;
			while(tmp>0) {
				index[j++]+= tmp%3;
				tmp/=3;
			}
		}
		int ans = 0;
		for(int i=19;i>=0;i++) {
			ans += (index[i]%3)*(Math.pow(3, 19-i));
		}
		return ans;
	}
	public static int singleNumber(int[] A, int n) {
		int ones=0;int twos = 0;
		for(int i=0;i<n;i++) {
			ones = (ones ^ A[i]) & ~twos;
			twos = (ones & A[i]) | (twos & ~A[i]);
			
		}
		return ones;
	}

}
