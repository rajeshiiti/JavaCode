package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		System.out.println(str.charAt(0));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointCount(0, 2));
		
		inp.close();
	}

}
