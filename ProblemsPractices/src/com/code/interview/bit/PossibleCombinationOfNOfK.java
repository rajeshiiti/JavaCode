package com.code.interview.bit;

import java.util.ArrayList;

public class PossibleCombinationOfNOfK {
	
	public static void main(String[] args) {
		combine(1, 1);
	}
	
	
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		int[] data = new int[k+1];
		combination(data, 1, 1, k, n,list);
		return list;
		
	}
	public static void combination(int[] data, int dataCounter,int dataElement, int k , int n,ArrayList<ArrayList<Integer>> list) {
		if(dataCounter== k+1) {
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int i=1;i<=k;i++) {
				l.add(data[i]);
			}
			list.add(l);
			return;
		}
		if(k-dataCounter>n-dataElement) {
			return;
		}
		for(int i=dataElement;i<=(n-(k-dataCounter));i++) {
			data[dataCounter] = i; 
			combination(data, dataCounter+1, i+1, k, n, list);
		}
		
	}

}
