package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class SortedInsertPosition {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);
		System.out.println(searchInsert(list, 7));
	}
	public static int searchInsert(ArrayList<Integer> a, int b) {
		int start = 0;
		int end = a.size()-1;
		int index = binarySearch(a,start,end,b);
		if(a.get(index)==b) {
			return index;
		} else {
			if(a.get(0)>b) {
				return 0;
			} else if(a.get(end)<b){
			    return end;
			} else if(a.get(index)<b){
				return index+1;
			} else return index-1;
		}
	}
	

	private static int binarySearch(List<Integer> a, int start, int end, int b) {
		int mid = (start+end)/2;
		if(a.get(mid)==b) {
			return mid;
		} else if(start==end) {
			return start;
		} else if(a.get(mid)<b) {
			return binarySearch(a, mid+1, end, b);
		} else {
			return binarySearch(a, start, mid, b);
		}
		
	}

}
