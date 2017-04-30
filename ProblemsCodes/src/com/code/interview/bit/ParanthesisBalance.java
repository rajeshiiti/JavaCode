package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;

public class ParanthesisBalance {
	public static void main(String[] args) {
		
	}
	public int evalRPN(ArrayList<String> a) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<a.size();i++) {
			switch(a.get(i)) {
			case "+" : {
				int tmp1  = stack.pop();
				int tmp2 = stack.pop();
				stack.push(tmp1+tmp2);
				break;
			} case "-" : {
				int tmp1  = stack.pop();
				int tmp2 = stack.pop();
				stack.push(tmp2-tmp1);
				break;
			} case "/" : {
				int tmp1  = stack.pop();
				int tmp2 = stack.pop();
				stack.push(tmp2/tmp1);
				break;
			} case "*" : {
				int tmp1  = stack.pop();
				int tmp2 = stack.pop();
				stack.push(tmp1*tmp2);
				break;
			} default :{
				stack.push(Integer.parseInt(a.get(i)));
			}
			}
		}
		return stack.pop();
	}

}
