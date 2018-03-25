package com.code.interview.bit;

import java.util.ArrayList;


public class RootToLeafSum {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		RootToLeafSum rls = new RootToLeafSum();
		TreeNode tn1 = rls.new TreeNode(1);
		TreeNode tn2 = rls.new TreeNode(2);
		TreeNode tn3 = rls.new TreeNode(3);
		TreeNode tn4 = rls.new TreeNode(2);
		TreeNode tn5 = rls.new TreeNode(2);
		TreeNode tn6 = rls.new TreeNode(1);
		TreeNode tn7 = rls.new TreeNode(1);
		
		tn1.left = tn2;
		tn1.right = tn3;
		tn2.left =tn4;
		tn2.right = tn5;
		tn3.left = tn6;
		tn3.right = tn7;
		tn4.left = tn4.right = tn5.left = tn5.right = tn6.left = tn6.right = tn7.left = tn7.right = null;
		ArrayList<ArrayList<Integer>> ans  =rls.pathSum(tn1, 5);
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				System.out.print(ans.get(i).get(j) +" ");
			}
			System.out.println();
		}
		
		
	}
	
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> ans = getPathSum(root,sum);
		for(ArrayList<Integer> list : ans) {
			int i=0,j=list.size()-1;
			while(i<j) {
				int tmp = list.get(i);
				list.set(i, list.get(j));
				list.set(j, tmp);
				i++;
				j--;
			}
		}
		return ans;
	}

	private ArrayList<ArrayList<Integer>> getPathSum(TreeNode root, int sum) {
		ArrayList<ArrayList<Integer>> ans = null;
		if(root != null && sum-root.val>=0) {
			if(root.left == null && root.right == null) {
				if(sum-root.val == 0) {
					ans = new ArrayList<ArrayList<Integer>>();
					ArrayList<Integer> l1 = new ArrayList<Integer>();
					l1.add(root.val);
					ans.add(l1);
				}
				return ans;
			} else {
				ArrayList<ArrayList<Integer>> ans1 = getPathSum(root.left, sum-root.val);
				ArrayList<ArrayList<Integer>> ans2 = getPathSum(root.right, sum-root.val);
				for(ArrayList<Integer> list : ans1) {
					list.add(root.val);
				}
				for(ArrayList<Integer> list : ans2) {
					list.add(root.val);
				}
				ans1.addAll(ans2);
				return ans1;
			}
		}
		return ans;
	}

}
