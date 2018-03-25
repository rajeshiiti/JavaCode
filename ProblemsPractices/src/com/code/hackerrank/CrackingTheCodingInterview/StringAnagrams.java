package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

public class StringAnagrams {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String first  = inp.nextLine();
		String second = inp.nextLine();
		System.out.println(getTotalDeletaion(first,second));
		inp.close();
	}

	private static int getTotalDeletaion(String first, String second) {
		int deletion=0;
		int[] array1 = new int[27];
		int[] array2 = new int[27];
		for(int i=0;i<=26;i++) {
			array1[i]=0;
			array2[i]=0;	
		}

		for(int i=0;i<first.length();i++) {
			array1[first.codePointAt(i) -97] = array1[first.codePointAt(i) -97] + 1;
		}
		for(int i=0;i<second.length();i++) {
			array2[second.codePointAt(i) -97] = array2[second.codePointAt(i) -97] + 1;
		}
		for(int i=0;i<=26;i++) {
			deletion = deletion + Math.abs(array1[i]-array2[i]);
		}
		return deletion;
	}

}
