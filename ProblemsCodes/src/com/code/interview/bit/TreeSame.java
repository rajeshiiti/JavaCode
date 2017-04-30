package com.code.interview.bit;

public class TreeSame {
	
	class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	public int isSameTree(TreeNode a, TreeNode b) {
	    return isTreeSame(a,b);
	}
	public int isTreeSame(TreeNode a, TreeNode b) {
	    if(a!=null && b!=null) {
	        if(a.val == b.val && isTreeSame(a.left,b.left)==1 && isTreeSame(a.right,b.right)==1) {
	            return 1;
	        } else {
	            return 0;
	        }
	        
	    } else if( (a==null && b!=null) ||(a!=null && b==null) ) {
	        return 0;
	    }
	    return 1;
	}

}
