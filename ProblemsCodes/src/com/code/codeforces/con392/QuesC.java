package com.code.codeforces.con392;

import java.util.Scanner;

public class QuesC {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		long n = inp.nextLong();
		long m = inp.nextLong();
		long k = inp.nextLong();
		long x = inp.nextLong();
		long y = inp.nextLong();
		inp.close();
		long[][] std = new long[200][200];
		for(int i=0;i<200;i++) {
			for(int j=0;j<200;j++) 
				std[i][j] = 0;
		}
		long max =-1L;
		long min = 1000000000000000001L;
		if(n<=2) {
			long reminder = k%(n*m);
			long devide = k/(n*m);
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=m;j++) {
					if(reminder>0) {
						std[i][j] = devide+1;
						reminder--;
					} else {
						std[i][j] = devide;
					}
				}
			}
		} else {
			long reminder = k%(((n+n-2)*m));
			long devide = k/(((n+n-2)*m));
			for(int i=1;i<=n+n-2;i++) {
				for(int j=1;j<=m;j++) {
					if(reminder>0) {
						std[i][j] = devide+1;
						reminder--;
					} else {
						std[i][j] = devide;
					}
				}
			}
			for(int i=2;i<=n-1;i++) {
				for(int j=1;j<=m;j++) {
					std[i][j] = std[i][j]+std[(int) (n+n-i)][j];
				}
			}
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				max = Math.max(max, std[i][j]);
				min = Math.min(min, std[i][j]);
			}
		}
		System.out.println(max+" "+min+" "+std[(int) x][(int) y]);
		
		
		
	}

}
