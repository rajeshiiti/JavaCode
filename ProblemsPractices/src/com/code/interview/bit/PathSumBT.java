package com.code.interview.bit;


public class PathSumBT {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int hasPathSum(TreeNode a, int b) {
		if(getpathSum(a, b)) {
			return 1;
		} else {
			return 0;
		}
 		
	}
	
	public  boolean getpathSum(TreeNode a, int b) {
		if(a!=null) {
			if(a.left!=null && a.right==null) {
				return getpathSum(a.left, b-a.val);
			} else if(a.left==null && a.right!=null) {
				return getpathSum(a.right, b-a.val);
			}
			return (getpathSum(a.left, b-a.val) || getpathSum(a.right, b-a.val));
		}
		if(b!=0) {
			return false;
		} else {
			return true;
		}
		
	}

}
