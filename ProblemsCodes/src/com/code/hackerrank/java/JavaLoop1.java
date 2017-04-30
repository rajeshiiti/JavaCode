package com.code.hackerrank.java;

import java.util.Scanner;

public class JavaLoop1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a=inp.nextInt();
		for(int i=1;i<=10;i++) {
				System.out.println(a+" x "+i+" = "+a*i);
		}
		inp.close();
	}

}
