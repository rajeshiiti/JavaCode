package com.code.algo.sort;


public class BubbleSort {

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
		bubbleSort(array,n);
		
		// print after sorted
		System.out.println("print after sorted: ");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
		
	}
	
	public static void bubbleSort(int[] array, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-1-i);j++) {
				if(array[j]>array[j+1]) {
					int value = array[j];
					array[j] = array[j+1];
					array[j+1] = value;
				}
			}
		}
	}

}
