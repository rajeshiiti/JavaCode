package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;

public class CombinationSum {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(6);
		a.add(7);
		ArrayList<ArrayList<Integer>> ans = combinationSum(a, 7);
		for(int i = 0;i<ans.size();i++) {
			for(int j = 0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j));
			}
			System.out.println();
		}
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
				tmpList.add(a.get(i));
				for(int ii=0;ii<tmpList.size();ii++) {
					System.out.print(tmpList.get(ii)+" ");
				}
				System.out.println();
				backTracking(ans, tmpList, a, remain-a.get(i), i);
				tmpList.remove(tmpList.size()-1);
			}
		}
	}

}
