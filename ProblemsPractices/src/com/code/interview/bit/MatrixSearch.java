package com.code.interview.bit;

import java.util.ArrayList;

public class MatrixSearch {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = getInput();
		System.out.println(searchMatrix(a, 25));
		
	}
	
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
		int n = a.size();
		int m =a.get(0).size();
		int start = 0; 
		int end = n*m-1;
		while(start<=end) {
			int mid = (start+end) /2;
			int mi = mid/m;
			int mj = mid%m;
			
			if(a.get(mi).get(mj)==b) {
				return 1;
			}
			else if(a.get(mi).get(mj)>b) {
				end = mid;
			} else {
				start = mid+1;
			} 
		}
		return 0;
	}

	private static ArrayList<ArrayList<Integer>> getInput() {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(7);
		a.add(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(10);
		list2.add(15);
		list2.add(17);
		a.add(list2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(21);
		list3.add(23);
		list3.add(26);
		list3.add(31);
		a.add(list3);
		return a;
	}
}
