package com.code.interview.bit;

import java.util.ArrayList;


public class RootToLeafSumNumbers {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static int mod = 1003;
	public int sumNumbers(TreeNode a) {
		ArrayList<ArrayList<Integer>> ans = getAns(a);
		int an = 0;
		for(int i=0;i<ans.size();i++) {
			int j=ans.get(i).size()-1;
			while(j>=0 && ans.get(i).get(j)==0) {
				j--;
			}
			int tmp = 0;
			while(j>=0) {
				tmp = tmp * 10 + ans.get(i).get(j);
				tmp %= mod; 
				j--;
			}
			an +=tmp;
			an %=mod;
		}
		return an;
		
	}
	private ArrayList<ArrayList<Integer>> getAns(TreeNode a) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		if(a!=null) {
			if(a.left==null && a.right !=null) {
				ArrayList<Integer> ls = new ArrayList<Integer>();
				ls.add(a.val);
				ans.add(ls);
				return ans;
			}
			ArrayList<ArrayList<Integer>> ans1 = getAns(a.left);
			ArrayList<ArrayList<Integer>> ans2 = getAns(a.right);
			ans.addAll(ans1);
			ans.addAll(ans2);
			for(ArrayList<Integer> list : ans) {
				list.add(a.val);
			}
		}
		return ans;
	}

}
