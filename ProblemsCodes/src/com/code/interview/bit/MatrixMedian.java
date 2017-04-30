package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixMedian {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		System.out.println(getUpperBoundBinarySearch(list, 5, 0, 5));
	}
	public static int findMedian(ArrayList<ArrayList<Integer>> A) {
		int min = A.get(0).get(0);
		int max = A.get(0).get(0);
		int n = A.size();
		int m = A.get(0).size();
		for(int i=0;i<n;i++) {
			if(min>A.get(i).get(0)) min = A.get(i).get(0);
			if(max<A.get(i).get(m-1)) max = A.get(i).get(m-1);
		}
		int element = 1 + (m*n)/2;
		while(min<max) {
			int mid = (min + max)/2;
			int cnt = 0;
			for(int i=0;i<n;i++) {
				if(A.get(i).get(0)>mid) {
					cnt+=0;
				} else if(A.get(i).get(m-1)<=mid) {
					cnt +=m;
				} else {
					cnt = cnt + getUpperBoundBinarySearch(A.get(i),mid,0,m-1);
				}
			}
			if(cnt<element) {
				min = mid+1;
			} else {
				max = mid;
			}
		}
		
		return min;
    }
	private static int getUpperBoundBinarySearch(ArrayList<Integer> arrayList,
			int midValue, int start, int end) {
		int mid = (start+end)/2;
		if(arrayList.get(mid)<=midValue && mid<end 
				&& arrayList.get(mid+1)>midValue) {
			return mid+1;
		} else if(arrayList.get(mid)<=midValue && mid==end) {
			return mid+1;
		} else if(arrayList.get(mid)<=midValue) {
			return getUpperBoundBinarySearch(arrayList, midValue, mid+1, end);
		} else {
			return getUpperBoundBinarySearch(arrayList, midValue, start, mid);
		}
	}

}
