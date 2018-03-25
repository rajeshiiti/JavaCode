package com.code.interview.bit;

import java.util.ArrayList;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("tedst");
		a.add("deds33");
		a.add("tedrrr");
		System.out.println(longestCommonPrefix(a));
	}
	public static String longestCommonPrefix(ArrayList<String> a) {
		if(a.size()==1) {
			return a.get(0);
		}
		int j = 0;
		String tmp = a.get(0);
		boolean exit = true;
		while(exit) {
			for(int i=1;i<a.size();i++) {
				if(tmp.length()<=j || a.get(i).length() <=j) {
					exit = false;
					break;
				}
				if(tmp.charAt(j) != a.get(i).charAt(j)) {
					if(j==0) {
						return "";
					} else {
						return tmp.substring(0, j);
					}
				}
			}
			if(!exit) {
				if(j==0) {
					return "";
				} else {
					return tmp.substring(0, j);
				}
			}
			j++;
		}
		return tmp;
	} 

}
