package com.code.interview.bit;

public class IsIntPallindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1211));
	}
	public static boolean isPalindrome(int a) {
		String str = new Integer(a).toString();
		int i = 0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
