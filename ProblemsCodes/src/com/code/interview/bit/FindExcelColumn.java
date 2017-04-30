package com.code.interview.bit;

public class FindExcelColumn {

	public static void main(String[] args) {
		System.out.println(convertToTitle(52));
	}
	public static String convertToTitle(int a) {
		int i = 100;
		char[] chars = new char[100];
		int rem = a % 26 ;
		while(a>0) {
			if(rem == 0) {
				chars[--i] = 'Z';
				a = (a /26) -1;
			} else {
				chars[--i] = (char) ((rem-1) + 'A');
				a = a / 26;
			}
			rem = a % 26;
		}
		return (new String(chars,i,100-i));
	}

}
