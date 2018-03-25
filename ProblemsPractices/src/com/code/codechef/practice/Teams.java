package com.code.codechef.practice;

import java.util.Scanner;

public class Teams {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int n = inp.nextInt();
			int m = inp.nextInt();
			for(int i=0;i<m;i++) {
				int tmp1 = inp.nextInt();
				int tmp2 = inp.nextInt();
			}
			int tmp = n - m*2;
			if(tmp==0 || tmp%2==0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			t--;
		}
		inp.close();
	}

}
