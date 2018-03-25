package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class ThreePointers {
	public static void main(String[] args) {
		ArrayList<Integer> list1  = new ArrayList<Integer>();
		list1.add(2);
		
		ArrayList<Integer> list2  = new ArrayList<Integer>();
		list2.add(2);
		
		ArrayList<Integer> list3  = new ArrayList<Integer>();
		list3.add(2);
		System.out.println(minimize(list1, list2, list3));
		
	}
	/**
	 * A : [2, 5, 9, 12]
        B : [4, 8, 11, 17]
        C : [6, 11, 19, 21]
	 */
	
	public static int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
		int i=0,j=0,k=0,ans=Integer.MAX_VALUE;
		ans = Math.min(ans,Math.max(Math.abs(a.get(i)-b.get(j)), Math.max(Math.abs(b.get(j)-c.get(k)), Math.abs(c.get(k)-a.get(i)))));
		while(i<a.size()-1 || j<b.size()-1 || k<c.size()-1) {
			if(a.get(i)<=b.get(j) && a.get(i)<=c.get(k) && i<a.size()-1) {
				i++;
			} else if (a.get(i)>b.get(j) && b.get(j)<=c.get(k) && j<b.size()-1) {
				j++;
			} else if(c.get(k)<=a.get(i) && c.get(k)<=b.get(j) && k<c.size()-1) {
				k++;
			} else if (i>=a.size()-1 && b.get(j)<=c.get(k) && j<b.size()-1) {
				j++;
			} else if(i>=a.size()-1 && b.get(j)>c.get(k) && k<c.size()-1) {
				k++;
			} else if(j>=b.size()-1 && a.get(i)<=c.get(k) && i<a.size()-1) {
				i++;
			} else if(j>=b.size()-1 && a.get(i)>c.get(k) && k<c.size()-1) {
				k++;
			} else if(k>=c.size()-1 && a.get(i)<=b.get(j) && i<a.size()-1) {
				i++;
			} else if(j<b.size() -1) {
				j++;
			} else if(k<c.size()-1) {
				k++;
			} else if(i<a.size()-1) {
				i++;
			}
			ans = Math.min(ans,Math.max(Math.abs(a.get(i)-b.get(j)), Math.max(Math.abs(b.get(j)-c.get(k)), Math.abs(c.get(k)-a.get(i)))));
			if(i==a.size()-1 && j==b.size()-1 && k==c.size())
				break;
		}
		return ans;
	}

}
