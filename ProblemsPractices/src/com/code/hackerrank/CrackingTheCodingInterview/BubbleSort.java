package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = inp.nextInt();
		}
		int numberOfSwap = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(array[j]>array[j+1]) {
					numberOfSwap++;
					int value = array[j];
					array[j] = array[j+1];
					array[j+1] = value;
				}
			}
		}
		//Array is sorted in 0 swaps.
		//First Element: 1
		//Last Element: 3
		System.out.println("Array is sorted in "+numberOfSwap+" swaps.");
		System.out.println("First Element: "+array[0]);
		System.out.println("Last Element: "+array[n-1]);
		inp.close();
	}

}
