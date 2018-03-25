package com.code.interview.bit;

import java.util.ArrayList;

public class PainterPartition {
	public static long mod = 10000003;
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1000000);
		list.add(1000000);
		System.out.println(paint(1,1000000,list));
		
	}
	/**
	 * 
	 * @param a painter
	 * @param b time
	 * @param c list of painter
	 * @return
	 */
	public static int paint(int a, int b, ArrayList<Integer> c) {
		int n = c.size();
		long[] A = new long[n+1];
		for(int i=0;i<n;i++) {
			A[i+1] = (long)( (long)c.get(i)*(long)b);
		}
		long hi = 0;
		long lo = Integer.MIN_VALUE;
		for(int i =1 ;i<=n; i++) {
			hi +=A[i];
			lo = Math.max(lo, A[i]);
		}
		return getPartition(A,n,a,lo,hi);
	}
	private static int getPartition(long[] A, int n, int a, long lo, long hi) {
		while(lo<hi) {
			long mid = (lo + hi )/2;
			int requiredPainters = getRequiredPainters(A, n, mid);
			if(requiredPainters<=a){
				hi = mid;
			} else {
				lo = mid+1;
			}
		}
		return (int) (lo %mod);
	}
	private static int getRequiredPainters(long[] A, int n, long mid) {
		long total = 0;
		int painter = 1;
		for(int i=1;i<=n;i++) {
			total+=A[i];
			if(total>mid) {
				total = A[i];
				painter++;
			}
		}
		return painter;
	}

}
