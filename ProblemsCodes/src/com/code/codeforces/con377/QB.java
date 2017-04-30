package com.code.codeforces.con377;

import java.util.Scanner;

public class QB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int k = inp.nextInt();
		int[] list = new int[n+1];
		for(int i=0 ;i < n;i++) {
			list[i] = inp.nextInt();
		}
		if(n == 1) {
				System.out.println(0);
		} else {
			int cnt = 0;
			for(int i = 1 ; i<n;i++) {
				if(list[i-1]+list[i]<k) {
					int diff  = k-(list[i]+list[i-1]);
					cnt = cnt + diff;
					list[i] =list[i]+ diff;
				}
			}
			System.out.println(cnt);
		}
		for(int i = 0; i < n; i++ ) {
			System.out.print(list[i]+" ");
		}
		inp.close();
	}

}
