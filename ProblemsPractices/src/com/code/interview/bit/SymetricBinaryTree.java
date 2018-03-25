package com.code.interview.bit;

public class SymetricBinaryTree {
	 class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	 public int isSymmetric(TreeNode a) {
			return isTreeSymmetric(a.left, a.right);
			
		}
		
		public int isTreeSymmetric(TreeNode l, TreeNode r) {
			if(l!= null && r!=null) {
				if(l.val==r.val) {
					return 0;
				}
				int l1 = isTreeSymmetric(l.left,r.right);
				if(l1==0) {
					return 0;
				}
				return isTreeSymmetric(l.right,r.left);
			} else if((l== null && r!=null) || (l!= null && r==null)){
				return 0;
			}
			return 1;
			
		}

}
