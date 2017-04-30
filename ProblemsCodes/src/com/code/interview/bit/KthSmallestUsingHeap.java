package com.code.interview.bit;

import java.util.List;

public class KthSmallestUsingHeap {
	public static void main(String[] args) {
		
	}
	public int kthsmallest(final List<Integer> a, int k) {
		int[] K = new int[k+1];
		int heapSize = 0;
		for(int i=0;i<k;i++) {
			heapSize++;
			K[heapSize] = a.get(i);
			maxHeapify(K,heapSize);
		}
		for(int i=k;i<a.size();i++) {
			if(K[1]>a.get(i)) {
				K[1] = a.get(i);
				heapify(K,1,heapSize);
			}
		}
		return K[1];
		
	}
	private void heapify(int[] k, int i, int heapSize) {
		int left = i*2;
		int right = left +1;
		int tmp =i;
		if(right <= heapSize && k[right]>k[tmp]) {
			tmp = right;
		} 
		if(left <= heapSize  && k[left]>k[tmp]) {
			tmp = left;
		}
		if(tmp!=i) {
			int tmp2 = k[i];
			k[i] = k[tmp];
			k[tmp] = tmp2;
			heapify(k, tmp, heapSize);
		}
	}
	private void maxHeapify(int[] k, int heapSize) {
		int parent = heapSize /2;
		if(parent>=1 && k[heapSize]>k[parent]) {
			int tmp = k[parent];
			k[parent] = k[heapSize];
			k[heapSize] = tmp;
			maxHeapify(k, parent);
		}
		
	}

}
