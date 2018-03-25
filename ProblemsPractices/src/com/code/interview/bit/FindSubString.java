package com.code.interview.bit;

public class FindSubString {
	
	public static void main(String[] args) {
		System.out.println(strStr("gabcabc", "abc"));
	}
	public static int strStr(final String haystack, final String needle) {
		if(haystack.length()<needle.length()) 
			return -1;
		if(needle.length()==0)
			return 1;
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			if(isMatched(i, haystack, needle)) {
				return i;
			}
		}
		return -1;
	    
	}
	public static boolean isMatched(int i,String haystack, String needle) {
		for(int j=0;j<needle.length();j++) {
			if(needle.charAt(j)!=haystack.charAt(i))
				return false;
			i++;
		}
		
		return true;
	}

}
