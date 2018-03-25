package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueJava {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i=1;i<=n;i++) {
			int a = inp.nextInt();
			if(a == 1) {
				int b = inp.nextInt();
				queue.add(b);
			} else if(a == 2) {
				if(!queue.isEmpty())
					queue.remove();
			} else {
				if(!queue.isEmpty())
					System.out.println(queue.peek());
			}
		}
		inp.close();
	}

}
