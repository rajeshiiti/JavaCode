package com.code.hackerrank.WeekOfCode24;

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int s=inp.nextInt(), t=inp.nextInt(),a=inp.nextInt(),b=inp.nextInt(),m=inp.nextInt(),n=inp.nextInt();
		int arrayM[] = new int[m];
		for(int i=0;i<m;i++) {
			arrayM[i] = inp.nextInt();
		}
		int arrayN[] = new int[n];
		for(int i=0;i<n;i++) {
			arrayN[i] = inp.nextInt();
		}
		
		int map[] = new int[200006];
		for(int i=0;i<200006;i++)
			map[i] = 0;
		for(int i=0;i<m;i++) {
			map[arrayM[i]+100000] = map[arrayM[i]+100000] + 1;
		}
		for(int i=0;i<n;i++) {
			map[arrayN[i]+100000] = map[arrayN[i]+100000] + 1;
		}
		int cnt=0;
		for(int i=s+100000;i<=t+100000;i++) {
			cnt = cnt + map[i];
		}
		System.out.println(cnt);
		inp.close();
	}

}
