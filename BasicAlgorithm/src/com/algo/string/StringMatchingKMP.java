package com.algo.string;

public class StringMatchingKMP {
	public static void main(String[] args) {
		System.out.println(kmp("abbabaab","baba"));
	}
	private static int kmp(String str1, String str2) {
		int[] pi = preProcess(str2);
		int q = -1;
		for(int i=0;i<str1.length();i++) {
			while(q>-1 && str1.charAt(i)!=str2.charAt(q+1)) {
				q = pi[q];
			}
			if(str1.charAt(i)==str2.charAt(q+1)) {
				q = q + 1;
			}
			if(q==str2.length()-1) {
				return i-str2.length()+1;
			}
		}
		// TODO Auto-generated method stub
		return 0;
	}
	private static int[] preProcess(String str2) {
		int[] pi = new int[str2.length()];
		pi[0] = -1;
		int k = -1;
		for(int i=1;i<str2.length();i++) {
			while(k>-1 && str2.charAt(i)!=str2.charAt(k+1)) {
				k = pi[k];
			}
			if(str2.charAt(i)==str2.charAt(k+1)) {
				k = k +1;
			}
			pi[i] = k;
		}
		return pi;
	}

}
