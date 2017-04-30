package com.code.hackerrank.WeekOfCode24;

import java.util.Scanner;

public class DevuSong {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int d = inp.nextInt();
		int cnt = 0;
		for(int i=1;i<=n;i++) {
			cnt  = cnt + inp.nextInt();
		}
		if( (d- cnt)%5 == 0) {
			System.out.println( (d-cnt)/5 );
		} else {
			System.out.println(-1);
		}
		inp.close();
	}

}
