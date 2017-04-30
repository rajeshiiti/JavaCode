package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class FourSum {
	public static void main(String[] args) {
		
	}
	public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> a, int b) {
		Collections.sort(a);
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<a.size()-3;i++) {
			if(i!=0 && a.get(i)==a.get(i-1)) {
				continue;
			}
			for(int j=i+1;j<a.size()-2;j++) {
				if(j-1!=i && a.get(j)==a.get(j-1)) {
					continue;
				}
				
				int l = j+1;
				int h = a.size()-1;
				while(l<h) {
					if(a.get(i)+a.get(j)+a.get(l)+a.get(h)<b) {
						l++;
					} else if(a.get(i)+a.get(j)+a.get(l)+a.get(h)>b) {
						h--;
					} else {
						ArrayList<Integer> list = new ArrayList<Integer>();
						list.add(a.get(i));
						list.add(a.get(j));
						list.add(a.get(l));
						list.add(a.get(h));
						ans.add(list);
						l++;
						h--;
						while(l<h && a.get(l)==a.get(l-1)) {
							l++;
						}
						while(l< h  && a.get(h)==a.get(h+1)) {
							h--;
						}
					}
				}
			}
		}
		
		return ans;
	    
	}

}
