package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountTriangles {
	public static long mod= 1000000009;
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list  = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		System.out.println(nTriang(list));
		inp.close();
	}
	public static int nTriang(ArrayList<Integer> A) {
		Collections.sort(A);
		long ans = 0;
		for(int i=A.size()-1;i>=2;i--) {
			int l = i-1;
			int r = 0;
			while(l>r) {
				if(A.get(l)+A.get(r)>A.get(i)) {
					ans = ans + (l-r);
					ans %= mod;
					l--;
				} else {
					r++;
				}
			}
		}
		return (int) (ans%mod);
	}

}
