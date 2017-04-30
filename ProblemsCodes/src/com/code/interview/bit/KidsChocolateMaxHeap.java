package com.code.interview.bit;

import java.util.ArrayList;

public class KidsChocolateMaxHeap {
	public static long mod = 1000000007L;
	public int nchoc(int A, ArrayList<Integer> B) {
		
		int[] heap = new int[B.size()+1];
		buildHeap(heap,B);
		long ans = 0;
		for(int i=0;i<A;i++) {
			ans +=heap[1];
			ans %=mod;
			maxHeapify(1,heap[1]/2,heap,B.size());
		}
		return (int) ans;
		
    }
	private void maxHeapify(int idx, int value, int[] heap, int size) {
		int l = idx*2;
		int r = idx*2+1;
		int index= idx;
		if(l<=size && heap[l]>heap[index]) {
			index = l;
		}
		if(r<=size && heap[r]>heap[index]) {
			index = r;
		}
		if(index!=idx) {
			int tmp = heap[index];
			heap[index] = heap[idx];
			heap[idx] = tmp;
			maxHeapify(index, heap[index], heap, size);
		}
		return;
		
	}
	private void buildHeap(int[] heap, ArrayList<Integer> b) {
		for(int i=0;i<b.size();i++) {
			heap[i+1] = b.get(i);
			heapify(i+1,heap);
		}
		
	}
	private void heapify(int i, int[] heap) {
		int tmp = i / 2 ;
		if(tmp>=1 && heap[tmp]<heap[i]) {
			int tmp1 = heap[tmp];
			heap[tmp] = heap[i];
			heap[i] = tmp1;
			heapify(tmp, heap);
		}
		
	}
	
	

}
