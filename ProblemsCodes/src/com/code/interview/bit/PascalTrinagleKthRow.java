package com.code.interview.bit;

import java.util.ArrayList;

public class PascalTrinagleKthRow {
	public static void main(String[] args) {
		int k = 5;
		ArrayList<Integer> list = getRow(k);
		for(Integer inte:list) {
			System.out.print(inte+" ");
		}
	}
	public static ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		for(int i=0;i<a;i++) {
			list.add(list.get(i)*(a-i)/(i+1));
		}
		return list;
	}

}


