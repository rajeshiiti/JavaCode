package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class SearchForARange {
	public static void main(String[] args) {
		List<Integer> list = getInput();
		ArrayList<Integer> ans = searchRange(list, 5);
		System.out.println(ans.get(0)+" "+ans.get(1));
	}
	public static ArrayList<Integer> searchRange(final List<Integer> a, int b) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int start = 0;
		int end = a.size()-1;
		int index = binarySearch(a,start,end,b);
		if(index==-1) {
			ans.add(-1);
			ans.add(-1);
		} else {
			if(a.get(0)==b) {
				ans.add(0);
			} else {
				ans.add(getStartIndex(a,0,index,b));
			}
			if(a.get(end)==b) {
				ans.add(end);
			} else {
				ans.add(getEndIndex(a,index,end,b));
			}
		}
		return ans;
	}
	
	
	private static Integer getEndIndex(List<Integer> a, int start, int end,
			int b) {
		int mid = (start+end) /2;
		if(a.get(mid)==b && mid<a.size()-1 && a.get(mid+1)>b) {
			return mid;
		} else if(a.get(mid)==b) {
			return getEndIndex(a, mid, end, b);
		} else {
			return getEndIndex(a, start, mid, b);
		}
	}
	private static Integer getStartIndex(List<Integer> a, int start, int end,
			int b) {
		int mid = (start+end) /2;
		if(a.get(mid)==b && mid>0 && a.get(mid-1)<b) {
			return mid;
		} else if(a.get(mid)==b) {
			return getStartIndex(a, 0, mid, b);
		} else {
			return getStartIndex(a, mid+1, end, b);
		}
	}
	private static int binarySearch(List<Integer> a, int start, int end, int b) {
		int mid = (start+end)/2;
		if(a.get(mid)==b) {
			return mid;
		} else if(start==end) {
			return -1;
		} else if(a.get(mid)<b) {
			return binarySearch(a, mid+1, end, b);
		} else {
			return binarySearch(a, start, mid, b);
		}
		
	}
	private static List<Integer> getInput() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(51);
		return list;
	}
	

}
