package com.data.structure.array.oneD;

import java.util.Scanner;
import java.util.Stack;

public class BiasedChandan {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = inp.nextInt();
		for(int i=0;i<n;i++) {
			int tmp = inp.nextInt();
			if(tmp == 0 && !stack.isEmpty()) {
				stack.pop();
			} else {
				stack.push(tmp);
			}
		}
		int sum = 0;
		for(Integer tmp:stack) {
			sum = sum + tmp;
		}
		System.out.println(sum);
		
		
		inp.close();
	}

}
