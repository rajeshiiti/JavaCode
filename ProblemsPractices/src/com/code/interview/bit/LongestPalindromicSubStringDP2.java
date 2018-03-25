package com.code.interview.bit;

public class LongestPalindromicSubStringDP2 {
	public static void main(String[] args) {
		System.out.println(getPalindrome("abb"));
	}
	public static String getPalindrome(String a) {
		int start = 0;
		int end = 0;
		int n = a.length();
		for(int i=0;i<n;i++) {
			int l=i-1;
			int h = i+1;
			while(l>=0 && h<n && a.charAt(l)==a.charAt(h)) {
				l--;
				h++;
			}
			l++;
			h--;
			if(h-l+1>end-start+1) {
				start = l;
				end = h;
			}
		}
		for(int i=0;i<n-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				int l=i-1;
				int h = i+2;
				while(l>=0 && h<n && a.charAt(l)==a.charAt(h)) {
					l--;
					h++;
				}
				l++;
				h--;
				if(h-l+1>end-start+1) {
					start = l;
					end = h;
				}
			}
		}
		return a.substring(start, end+1);
	}

}
