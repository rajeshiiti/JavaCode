package com.code.interview.bit;

public class PalindromicString {
	public static void main(String[] args) {
		String str = "Hi All";
		System.out.println(isPalindrome(str));
	}
	public static int isPalindrome(String a) {
		a =a.toLowerCase();
		int i =0,j = a.length()-1;
		while(i<j) {
			if( !(((int)a.charAt(i) >=97 && (int)a.charAt(i) <= 122) 
				|| ((int)a.charAt(i) >=48 && (int)a.charAt(i) <= 57)) ) {
				i++;
				continue;
			}
			if( !(((int)a.charAt(j) >=97 && (int)a.charAt(j) <= 122)
					||  ((int)a.charAt(j) >=48 && (int)a.charAt(j) <= 57))) {
				j--;
				continue;
			}
			if((int)a.charAt(i) != (int)a.charAt(j)) {
				return 0;
			}
			i++;
			j--;
		}
		return 1;
	}

}
