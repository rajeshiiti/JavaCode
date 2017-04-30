package com.code.codeforces.con354;

import java.util.Scanner;

public class QuesA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(),a;
		int posi1=1,posi2=n;
		for(int i=1;i<=n;i++) {
			a=input.nextInt();
			if(a==1) posi1=i;
			if(a==n) posi2=i;
		}
		if(posi1<posi2) {
			System.out.println(Math.max(n-posi1, posi2-1));
		} else {
			System.out.println(Math.max(n-posi2, posi1-1));
		}
		input.close();
	}
}
