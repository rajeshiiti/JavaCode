package com.code.interview.bit;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseWords("this      is not reverse string"));
	}
	public static String reverseWords(String a) {
		String[] str = a.split(" ");
		StringBuilder tmp = new StringBuilder();
		for(int i=str.length-1;i>=0;i--) {
			if(str[i].length()==0)
				continue;
			if(str[i]!=null && str[i]!=" ") {
				tmp.append(str[i]).append(" ");
			}
		}
		return tmp.toString().trim();
	}

}
