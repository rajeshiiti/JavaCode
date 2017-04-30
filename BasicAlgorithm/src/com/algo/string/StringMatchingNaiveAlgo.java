package com.algo.string;

public class StringMatchingNaiveAlgo {

	public static void main(String[] args) {
		System.out.println(isMatching("abbabaa","aba"));
	}

	private static boolean isMatching(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
		boolean bl = true;
		for(int i=0;i<=n-m;i++) {
			bl = true;
			int k =i;
			for(int j=0;j<m && bl;j++) {
				if(str1.charAt(k++)!=str2.charAt(j)) {
					bl = false;
				}
			}
			if(bl)
				return true;
		}
		return false;
	}
	

}
