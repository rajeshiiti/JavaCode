package com.code.interview.bit;


public class MaxDepthOfBTree {
	
		class TreeNode {
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(int x) { val = x; }
		}
	
	public int maxDepth(TreeNode a) {
		if(a!=null) {
			int ldepth = maxDepth(a.left);
			int rdepth = maxDepth(a.right);
			return Math.max(ldepth, rdepth)+1;
		}
		return 0;
	}

}
