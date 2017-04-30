package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PrintParanthesis {
	public static void main(String[] args) {
		ArrayList<String> ans = generateParenthesis(2);
		for(String str:ans) {
			System.out.println(str);
		}
	}
	public static ArrayList<String> generateParenthesis(int a) {
		ArrayList<String> ans = new ArrayList<String>();
		Stack<String> stack =  new Stack<String>();
		getAllPossibleParanthesis(ans,stack,a,a);
		return ans;
	}
	private static void getAllPossibleParanthesis(ArrayList<String> ans,
			Stack<String> stack, int open, int close) {
		if(close<open || open<0 || close<0) {
			return ;
		}
		if(open==0 && close==open) {
			Iterator<String> iterator =  stack.iterator();
			StringBuilder sb = new StringBuilder();
			while(iterator.hasNext()) {
				sb.append(iterator.next());
			}
			ans.add(sb.toString());
			return;
		}
		if(open>0) {
			stack.push("(");
			getAllPossibleParanthesis(ans,stack,open-1, close);
			stack.pop();
		}
		if(close>0) {
			stack.push(")");
			getAllPossibleParanthesis(ans, stack, open, close-1);
			stack.pop();
		}
		
	}

}
