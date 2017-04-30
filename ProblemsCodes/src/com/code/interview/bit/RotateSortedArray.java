package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class RotateSortedArray {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println(search(list, 4));
	}
	public static int search(final List<Integer> a, int b) {
		int pivot = findPivot(a,0,a.size()-1,b);
		if(pivot==-1) {
			return binarySearch(a, 0, a.size()-1, b);
		}
		if(a.get(pivot)==b) 
			return pivot;
		else if(pivot>0) {
			int tmp = binarySearch(a, 0, pivot, b);
			if(tmp>-1) {
				return tmp; 
			}
			tmp = binarySearch(a,pivot+1,a.size()-1, b);
			if(tmp>-1) {
				return tmp; 
			}
		}
		return -1;
	}
	private static int findPivot(List<Integer> a, int start, int end, int b) {
		int mid = (start+end) /2;
		if(mid>start && a.get(mid)<a.get(mid-1)) {
			return mid-1;
		} else if(mid<end && a.get(mid)>a.get(mid+1)) {
			return mid;
		} else if(end==start) {
			return -1;
		} else if(a.get(start)>=a.get(mid)) {
			return findPivot(a, start, mid, b);
		} else {
			return findPivot(a, mid, end, b);
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
