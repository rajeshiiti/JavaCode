package com.code.interview.bit;

import java.util.ArrayList;

public class GrayCode2 {
	public static void main(String[] args) {
		ArrayList<Integer> ans = grayCode(4);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
	
	public static ArrayList<Integer> grayCode(int a) {
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(a==0) {
			ans.add(0);
			return ans;
		} else if(a==1) {
			ans.add(0);
			ans.add(1);
			return ans;
		}
		int index = 2;
		ArrayList<Integer> l11 = new ArrayList<Integer>();
		ArrayList<Integer> l12 = new ArrayList<Integer>();
		ArrayList<Integer> l21 = new ArrayList<Integer>();
		ArrayList<Integer> l22 = new ArrayList<Integer>();
		l11.add(0);
		l12.add(1);
		l21.add(1);
		l22.add(0);
		list1.add(l11);
		list1.add(l12);
		list2.add(l21);
		list2.add(l22);
		for(int i=2;i<=a;i++) {
			
			for(int j=0;j<index;j++) {
				list1.get(j).add(0);
				list2.get(j).add(1);
			}
			for(int j=0;j<index;j++) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				for(int k=0;k<list2.get(j).size();k++) {
					l.add(list2.get(j).get(k));
				}
				list1.add(l);
			}
			for(int j = list2.size()-1 ;j>=0;j--) {
				list2.remove(j);
			}
			index *= 2;
			for(int j=list1.size()-1;j>=0;j--) {
				list2.add(new ArrayList<Integer>(list1.get(j)));
			}
		}
		for(int i=0;i<list1.size();i++) {
			int tmp = 0;
			for(int j=0;j<list1.get(i).size();j++) {
				tmp  = tmp + list1.get(i).get(j)*(int)Math.pow(2, j);
			}
			ans.add(tmp);
		}
		return ans;
		
	}

}