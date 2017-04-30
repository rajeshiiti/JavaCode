package com.code.interview.bit;

import java.util.List;


public class SortedArrayToBST {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	public TreeNode sortedArrayToBST(final List<Integer> a) {
		TreeNode root = getBBST(0,a.size()-1,a);
		return root;
		
	}
	private TreeNode getBBST(int l, int r, List<Integer> a) {
		if(l>r) {
			return null;
		}
		if(l==r) {
			TreeNode node = new TreeNode(a.get(r));
			node.left=node.right=null;
			return node;
		}
		int mid = (l+r) /2 ;
		TreeNode node = new TreeNode(a.get(mid));
		node.left = getBBST(l, mid-1, a);
		node.right = getBBST(mid+1, r, a);
		return node;
	}
}
