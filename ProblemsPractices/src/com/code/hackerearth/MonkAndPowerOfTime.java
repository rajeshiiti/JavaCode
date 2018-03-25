package com.code.hackerearth;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndPowerOfTime {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] exeOrder = new int[n];
		int[] idelOrder = new int[n];
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for(int i=0;i<n;i++) {
			queue.add(inp.nextInt());
		}
		for(int i=0;i<n;i++) {
			idelOrder[i] = inp.nextInt();
		}
		int cnt =0,l=0;
		while(!queue.isEmpty()) {
			if(queue.peek()==idelOrder[l]) {
				l++;
				queue.remove();
			} else {
				queue.add(queue.remove());
			}
			cnt++;
		}
		System.out.println(cnt);
	}

}
