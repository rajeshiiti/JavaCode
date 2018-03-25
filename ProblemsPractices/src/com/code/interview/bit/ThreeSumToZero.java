package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThreeSumToZero {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list  = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		ArrayList<ArrayList<Integer>> lists = threeSum(list);
		for(ArrayList<Integer> lis:lists) {
			for(Integer inte:lis) {
				System.out.print(inte+" ");
			}
			System.out.println();
		}
	}
	//-31013930 -31013930 9784175 21229755
	public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
		Collections.sort(a);
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a.size()-2;) {
			int l = i+1;
			int r = a.size()-1;
			while(l<r) {
				if(a.get(i)+a.get(r)+a.get(l)==0) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(a.get(i));
					list.add(a.get(l));
					list.add(a.get(r));
					lists.add(list);
					l++;
					r--;
					while(l<r && a.get(l).intValue()==a.get(l-1).intValue()) {
						l++;
					}
					while(l<r && a.get(r).intValue()==a.get(r+1).intValue()) {
						r--;
					}
				} else if(a.get(i)+a.get(r)+a.get(l)<0) {
					l++;
				} else {
					r--;
				}
			}
			i++;
			while(i<=a.size()-2 && a.get(i).intValue()==a.get(i-1).intValue()) {
			    i++;
			}
		 }
		return lists;
	}

}
