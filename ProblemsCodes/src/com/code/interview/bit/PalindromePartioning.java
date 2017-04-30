package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> ans = partition("aab");
		for(List<String> ll:ans) {
			for(String str:ll) {
				System.out.print(str+" ");
			}
			System.out.println();
		}
	}
	
	 public static ArrayList<ArrayList<String>>  dfs(String s, int i, boolean [][] isPalindrome) {
	        if (i >= s.length())
	            return null;

	        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();

	        for (int j = i, n = s.length(); j < n; ++j) {
	            if (isPalindrome[i][j]) {
	                String cut = s.substring(i, j + 1);
	                ArrayList<ArrayList<String>> others = dfs(s, j + 1, isPalindrome);
	                if (null != others) {
	                    for (ArrayList<String> l : others) {
	                        l.add(0, cut);
	                        result.add(l);
	                    }
	                }
	                else {
	                	ArrayList<String> ll = new ArrayList<String>();
	                    ll.add(cut);
	                    result.add(ll);
	                }
	            }
	        }
	        return result;
	    }

	    public static ArrayList<ArrayList<String>> partition(String s) {
	        int n = s.length();
	        boolean [][] isPalindrome = new boolean [n][n];
	        for (int i = 0; i < n; ++i)
	            for (int j = i; j >= 0; --j)
	                isPalindrome[i][j] = true;

	        for (int len = 2; len <= n; ++len)
	            for (int i = 0, j = i + len - 1; j < n; ++i, ++j)
	                isPalindrome[i][j] = (s.charAt(i) == s.charAt(j) && isPalindrome[i+1][j-1]);

	        return dfs(s, 0, isPalindrome);
	    }

}
