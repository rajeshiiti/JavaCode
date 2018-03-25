package com.java.sort;

import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "asd";
		array[1] = "asd1";
		array[2] = "asd2";
		System.out.println("Before sorting");
		for(int i=0;i<3;i++) {
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		System.out.println("After sorting");
		for(int i=0;i<3;i++) {
			System.out.println(array[i]);
		}
	}
}
