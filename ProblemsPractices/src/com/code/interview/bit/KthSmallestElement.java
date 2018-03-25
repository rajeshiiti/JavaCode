package com.code.interview.bit;

import java.util.ArrayList;


public class KthSmallestElement {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	public int kthsmallest(TreeNode root, int k) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		kthSmall(root,k,ans);
		return ans.get(k-1);
    }
	private void kthSmall(TreeNode root, int k, ArrayList<Integer> ans) {
		if(root.left!=null) {
			kthSmall(root.left, k, ans);
		}
		ans.add(root.val);
		if(root.right!=null) {
			kthSmall(root.right, k, ans);
		}
	}

}
