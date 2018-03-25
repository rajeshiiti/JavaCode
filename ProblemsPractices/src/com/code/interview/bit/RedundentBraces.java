package com.code.interview.bit;

import java.util.Stack;

public class RedundentBraces {
	public static void main(String[] args) {
		System.out.println(braces("(a+)(a+b))"));
	}
	public static int braces(String a) {
		Stack<Character> stack = new Stack<Character>();
		int n = a.length();
		for(int i=0;i<a.length();i++) {
			while(i<n && a.charAt(i)== ' ') {
				i++;
			}
			if(i>=n) {
				return 0;
			}
			char c = a.charAt(i);
			switch(c) {
			case '(' : {
				stack.push(c);
				break;
			} case ')' : {
				int cnt = 0;
				while(!stack.isEmpty() && stack.peek()!='(') {
					stack.pop();
					cnt++;
				}
				if(stack.isEmpty() || cnt == 0) {
					return 1;
				}
				stack.pop();
				break;
			} default :{
				if(c=='+' || c=='-' || c=='/' || c == '*') {
					stack.push(c);
				}
			}
				
			}
		}
		return 0;
	}

}
