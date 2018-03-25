package com.code.hackerearth;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MonkLoveForFood {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int q = inp.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		while(q>0) {
			int tmp = inp.nextInt();
			if(tmp==1) {
				if(stack.isEmpty()) {
					System.out.println("No Food");
				} else {
					System.out.println(stack.pop());
				}
			} else {
				stack.push(inp.nextInt());
			}
			q--;
		}
		
	}

}

