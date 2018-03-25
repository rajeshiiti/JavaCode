package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum2 {
	public static void main(String[] args) {
		// A : [ 8, 10, 6, 11, 1, 16, 8 ]
		// B : 28
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(8);
		list.add(10);
		list.add(6);
		list.add(11);
		list.add(1);
		list.add(16);
		list.add(8);
		ArrayList<ArrayList<Integer>> ans = combinationSum(list, 28);
		System.out.println(ans.size());
	}
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Collections.sort(a);
		backTracking(ans, new ArrayList<Integer>(), a, b, 0);
		return ans;
	}
	
	public static void backTracking(ArrayList<ArrayList<Integer>> ans, 
			ArrayList<Integer> tmpList,ArrayList<Integer> a,int remain,int start) {
		if(remain<0){
			return;
		}
		else if(remain==0) {
			boolean bl = false;
			for(int i = 0 ;i<ans.size();i++) {
				if(tmpList.size()==ans.get(i).size()) {
					bl = true;
					for(int j=0;j<tmpList.size() && bl;j++) {
						if(tmpList.get(i)!=ans.get(i).get(j)) {
							bl = false;
						}
					}
					if(bl) {
						break;
					}
				}
			}
			if(!bl) {
				ans.add(new ArrayList<Integer>(tmpList));
			}
		}
		else {
			for(int i =start; i < a.size();i++) {
				if(i > start && a.get(i) == a.get(i-1)) continue;
				tmpList.add(a.get(i));
				backTracking(ans, tmpList, a, remain-a.get(i), i+1);
				tmpList.remove(tmpList.size()-1);
			}
		}
	}
	
	

}
