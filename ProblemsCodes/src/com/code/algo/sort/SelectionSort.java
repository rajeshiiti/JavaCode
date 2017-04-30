package com.code.algo.sort;

public class SelectionSort {
	
	public static void main(String[] args) {
		int n = 5;
		int[] array = new int[n];
		array[0] = 5;
		array[1] = 15;
		array[2] = 52;
		array[3] = -53;
		array[4] = 23;
		
		// print before sorted
		System.out.println("print before sorted: ");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		selectionSort(array,n);
		
		// print after sorted
		System.out.println("print after sorted: ");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}

	private static void selectionSort(int[] array, int n) {

		for(int i = 0; i < n-1; i++) {
			int idx = i;
			for(int j=i+1;j<n;j++) {
				if(array[idx]>array[j]) {
					idx = j;
				}
			}
			if(idx!=i) {
				int value = array[i];
				array[i] = array[idx];
				array[idx] = value;
			}
		}
		
	}

}
