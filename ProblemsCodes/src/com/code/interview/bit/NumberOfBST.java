package com.code.interview.bit;

public class NumberOfBST {
	public static void main(String[] args) {
		System.out.println(numTrees(3));
	}
	public static int numTrees(int a) {
		int[] t = new int[a+1];
		t[0] = 1;
		t[1] = 1;
		if(a== 0 ) {
			return 0;
		}
		for(int i=2;i<=a;i++) {
			int tmp = 0;
			for(int j=1;j<=i;j++) {
				tmp = tmp + (t[j-1]*t[i-j]);
			}
			t[i] = tmp;
		}
		return t[a];
	}

}
