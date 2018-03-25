package com.codeforce.practice;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s1 = inp.nextLine();
		String s2 = inp.nextLine();
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println(0);
		} else if(s1.compareToIgnoreCase(s2)<0) {
			System.out.println(-1);
		} else {
			System.out.println(1);
		}

	}

}
