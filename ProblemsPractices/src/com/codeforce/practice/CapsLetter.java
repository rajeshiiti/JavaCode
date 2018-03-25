package com.codeforce.practice;

import java.util.Scanner;

public class CapsLetter {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str=inp.nextLine();
		int len=str.length();
		char[] charArray = new char[len];
		String str1="";
		if(str.charAt(0)>=97 || str.charAt(0)<=122) {
			charArray[0]=(char) (str.charAt(0)-32);
		}
		for(int i=1;i<str.length();i++) {
			if(str.charAt(0)>=65 || str.charAt(0)<=90) {
				charArray[i]=(char) (str.charAt(i)+32);
			}
		}
		for(int i =0;i>len;i++) {
			System.out.println(charArray[i]);
		}
	}

}
class CharMap {
	char small;
	char cap;
}
