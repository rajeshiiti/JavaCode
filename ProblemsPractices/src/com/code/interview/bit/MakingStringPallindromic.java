package com.code.interview.bit;

public class MakingStringPallindromic {
	
	
	public static int solve(String A) {
		int len = A.length();
		if(len<=1) {
			return 0;
		}
		int i=0;
		int j=len-1;
		int tmp =0;
		while(i<j) {
			while(i<j && A.charAt(i)==A.charAt(j)) {
				i++;
				j--;
			}
			if(i==j || i>j) {
				return tmp;
			} else {
				i=0;
				j = len-1;
				tmp++;
				j -=tmp;
			}
		}
		return len-1;
		
    }
	public static void main(String[] args) {
		
		String tester = "aaacde";
		System.out.println(solve(tester));
	}
 
	public static String convertPalindrome(String str) {
		if (str == null)
			return str;
		int n = str.length();
		if ((n == 0) || (n == 1))
			return str;
 
		StringBuilder strBuilder = new StringBuilder(str);
		int i = 0;
		int j = n - 1;
		int appendIndex = 0;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				appendIndex=j+1;
				strBuilder.insert(appendIndex, str.charAt(i));	
				i++;
			}
		}
		return strBuilder.toString();
	}

}
