package com.code.interview.bit;


public class GeneratesAllParenthese {
	public static void main(String[] args) {
		System.out.println(isBalanced("{{[}}}"));
	}

	private static int isBalanced(String string) {
		// TODO Auto-generated method stub
		
		char[] chars = new char[string.length()+1];
		
		int j = 0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='(' || string.charAt(i)=='{' || string.charAt(i)=='[') {
				chars[j++] = string.charAt(i);
			} else {
				if(string.charAt(i)==')' && j>0 && chars[j-1]=='(') {
					j--;
				} else if(string.charAt(i)==']' && j>0 && chars[j-1]=='[') {
					j--;
				} else if(string.charAt(i)=='}' && j>0 && chars[j-1]=='{') {
					j--;
				} else return 0;
			}
		}
		if(j==0) {
			return 1;
		} 
		return 0;
	}

}
