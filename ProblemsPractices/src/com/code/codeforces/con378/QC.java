package com.code.codeforces.con378;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QC {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		for(int i = 1;i <= n; i ++ ) {
			int tmp = inp.nextInt();
			queue.add(tmp);
		}
		int k = inp.nextInt();
		
		Queue<Integer> queueJ = new ArrayDeque<Integer>();
		
		for(int i = 1;i <= k; i ++ ) {
			int tmp = inp.nextInt();
			queueJ.add(tmp);
		}
		result(queue,queueJ,n,k);
		inp.close();
		
	}

	private static void result(Queue<Integer> queue, Queue<Integer> queueJ,
			int n, int k) {
		
	}
	

}
class IndexAndMove {
	int index;
	char ch;
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
}