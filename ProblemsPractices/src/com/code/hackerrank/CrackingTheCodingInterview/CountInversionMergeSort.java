package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountInversionMergeSort {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t  = inp.nextInt();
		int tr = 100000;
		String tmp ="";
		while(tr>0) {
			tmp = tmp +" "+Integer.toString(t);
		/*	int n = inp.nextInt();
			long[] ciArray = new long[n+1];
			for(int i=1;i<=n;i++) {
				ciArray[i]= inp.nextLong();
			}
			System.out.println(merge(ciArray,1,n));*/
			
			tr--;
			t--;
		}
		System.out.println(tmp.trim());
		inp.close();
	}

	private static long merge(long[] cntArray, int l, int n) {
		long cnt =0;
		if(l<n) {
			int mid = (l+n) /2;
			cnt = merge(cntArray, l, mid);
			cnt = cnt + merge(cntArray, mid+1, n);
			cnt = cnt + merger(cntArray,l,mid,n);
		}
		return cnt;
		
	}

	private static long merger(long[] cntArray, int l, int mid, int h) {
		long cnt = 0;
		int low = l;
		int mi = mid +1;
		List<Long> list = new ArrayList<Long>();
		while(low<=mid && mi<=h) {
			if(cntArray[low]>cntArray[mi]) {
				cnt = cnt + (mid-low+1);
				list.add(cntArray[mi]);
				mi++;
			} else {
				list.add(cntArray[low]);
				low++;
			}
		}
		while(low<=mid) {
			list.add(cntArray[low]);
			low++;
		}
		while(mi<=h) {
			list.add(cntArray[mi]);
			mi++;
		}
		low =  l;
		for(long lnt:list) {
			cntArray[low] = lnt;
			low++;
		}
		return cnt;
	}

}
