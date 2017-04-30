package com.algo.datastructure;

import java.util.Scanner;

public class MinHeap {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] minHeap = new int[n+1];
		for(int i=1;i<=n;i++) {
			minHeap[i] = inp.nextInt();
			minifyHeap(minHeap,i);
			System.out.println("Minimum Value: "+minHeap[1]);
		}
		inp.close();
	}

	private static void minifyHeap(int[] minHeap, int i) {
		while(i/2>=1) {
			if(minHeap[i]<minHeap[i/2]) {
				int tmp = minHeap[i];
				minHeap[i] = minHeap[i/2];
				minHeap[i/2] = tmp;
			}
			i/=2;
		}
		
	}

}
