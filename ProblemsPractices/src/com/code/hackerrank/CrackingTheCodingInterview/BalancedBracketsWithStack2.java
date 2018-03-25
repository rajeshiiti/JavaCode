package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsWithStack2 {
	static char char1='{';
	static char char2='}';
	static char char3='(';
	static char char4=')';
	static char char5='[';
	static char char6=']';

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.nextLine();
		for(int i=1;i<=n;i++) {
			String brackets = inp.nextLine();
			if(bracketsBalanced(brackets)) 
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
		inp.close();
	}

	private static boolean bracketsBalanced(String brackets) {
		Stack<String> stack = new Stack<String>();
		int lng = brackets.length();
		if(lng%2==1) {
			return false;
		}
		for(int i=0;i<lng;i++) {
			if( brackets.charAt(i) == char1 
					|| brackets.charAt(i) == char3 
					|| brackets.charAt(i) == char5) {
				stack.push(brackets.substring(i, i+1));
			} else {
				if(stack.isEmpty())
					return false;
				String str = stack.lastElement();
				if(brackets.charAt(i) == char2) {
					if(str.charAt(0) == char1) {
						stack.pop();
					} else 
						return false;
				} else if(brackets.charAt(i) == char4) {
					if( str.charAt(0) == char3) {
						stack.pop();
					} else 
						return false;
				} else if(brackets.charAt(i) == char6) {
					if( str.charAt(0) == char5) {
						stack.pop();
					} else 
						return false;
				}
			}
		}
		if(stack.isEmpty())
			return true;
		return false;
		
	}

}
 