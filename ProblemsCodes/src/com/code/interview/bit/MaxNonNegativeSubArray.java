package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxNonNegativeSubArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		ArrayList<Integer> list = maxset(array);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		inp.close();
	}
	public static  ArrayList<Integer> maxset(ArrayList<Integer> a) {
		int n = a.size();
		int l = 0;
		int r = 0;
		int i=0,j=0;
		long len = -1;
		while(i<n && j<n) {
			long tmp = 0;
			while(i<n && j<n && a.get(j)>=0) {
				tmp += (long)a.get(j) ;
				j++;
			}
			if(tmp>len) {
				len = tmp;
				l = i;
				r = j-1;
			}
			while(i<n && j<n && a.get(j)<0) {
				j++;
			}
			if(j<n) {
				i = j;
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(len==-1)
		    return ans;
		for(int ii=l;ii<=r;ii++) {
			ans.add(a.get(ii));
		}
		return ans;
	}

}
