package com.code.interview.bit;


public class IsTreeBalanced {
	public static void main(String[] args) {
		IsTreeBalanced tb = new IsTreeBalanced();
		TreeNode t1 = tb.new TreeNode();
		TreeNode t2 = tb.new TreeNode();
		TreeNode t3 = tb.new TreeNode();
		TreeNode t4 = tb.new TreeNode();
		t1.left = t4;
		t4.left = t4.right =null;
		t1.right = t2;
		t2.right = t3;
		t2.left=t3.right=t3.left=null;
		System.out.println(tb.isBalanced(t1));
	}
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	} 
	public int isBalanced(TreeNode a) {
		if(a!=null) {
			if(isBalance(a)!=-1) {
				return 1;
			}
		}
		return 0;
	}
	
	public int isBalance(TreeNode a) {
		int l = 0, r = 0;
		if(a.left!= null) {
			l = isBalance(a.left);
		}
		if(a.right != null) {
			r = isBalance(a.right);
		}
		if(l<0 || r<0) {
			return -1;
		}
		if(Math.abs(r-l)>1) {
			return -1;
		}
		return Math.max(l, r) +1;
		
	}

}
