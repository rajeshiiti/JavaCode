package com.code.codeforces.con377;

import java.util.Scanner;

public class QA {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int k = inp.nextInt();
		int r = inp.nextInt();
		int tmp = k ;
		inp.close();
		int cnt = 1;
		while (true) {
			if (k % 10 == 0 || (k - r) % 10 == 0) {
				System.out.println(cnt);
				return ;
			}
			cnt = cnt + 1;
			k = k + tmp;
		}
	}

}
