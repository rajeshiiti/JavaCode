package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BackTrackingSubSet {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(15);
		a.add(20);
		a.add(12);
		a.add(19);
		a.add(4);
		//15, 20, 12, 19, 4
		ArrayList<ArrayList<Integer>>  ans = subsets(a);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j)+" ");
			}
			System.out.println("");
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	}
	
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
		Collections.sort(a);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); 
		int i  = a.size()-1;
		while(i>=0) {
			int val = a.get(i);
			int sizeOfList = 0;
			int tmp = list.size();
			while(sizeOfList<tmp) {
				ArrayList<Integer> al = new ArrayList<Integer>();
				for(int j=0;j<list.get(sizeOfList).size();j++) {
					al.add(list.get(sizeOfList).get(j));
				}
				al.add(val);
				list.add(al);
				sizeOfList++;
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(a.get(i));
			boolean bl =false;
			for(int ii=0;ii<list.size();ii++) {
				if(list.get(ii).size()==al.size()) {
					bl = true;
					for(int j=0;j<al.size() && bl;j++) {
						if(list.get(ii).get(j)!=al.get(j)) {
							bl =false;
						}
					}
					if(bl) break;
				}
			}
			if(!bl) {
				list.add(al);
			}
			i--;
		}
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		list1.add(new ArrayList<Integer>());
		for(i=list.size()-1;i>=0;i--) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int j = list.get(i).size()-1;j>=0;j--) {
				al.add(list.get(i).get(j));
			}
			list1.add(al);
		}
		return list1;
	}

}
