package com.data.structure.array.oneD;

import java.util.Scanner;
import java.util.Stack;

public class NiceArchers {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int m = inp.nextInt();
		int cnt=0;
		inp.nextLine();
		for(int i=0;i<m;i++) {
			String tmp = inp.nextLine();
			cnt =cnt + isBublyString(tmp);
		}
		System.out.println(cnt);
		inp.close();
	}

	private static int isBublyString(String tmp) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<tmp.length();i++) {
			int tmp1 = tmp.charAt(i);
			if(!stack.isEmpty() && stack.peek()==tmp1) 
				stack.pop();
			else 
				stack.push(tmp1);
		}
		if(stack.empty())
			return 1;
		else return 0;
	}

}
