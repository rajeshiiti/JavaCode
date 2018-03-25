package com.code.interview.bit;

import com.code.interview.bit.LowestCommonAnccestorInBST.TreeNode;

public class FlatABinaryTree {
	
	public static void main(String[] args) {
		LowestCommonAnccestorInBST ls = new LowestCommonAnccestorInBST();
		TreeNode n1 = ls.new TreeNode(1);
		TreeNode n2 = ls.new TreeNode(2);
		TreeNode n3 = ls.new TreeNode(3);
		TreeNode n4 = ls.new TreeNode(4);
		TreeNode n5 = ls.new TreeNode(5);
		TreeNode n6 = ls.new TreeNode(6);
		
		n1.left = n2;
		n1.right = n5;
		n2.left = n3;
		n2.right = n4;
		n5.right = n6;
		n3.left = n3.right = n4.left = n4.right = n5.left = n6.left = n6.right = null;
		FlatABinaryTree bnt = new FlatABinaryTree();
		TreeNode tn = bnt.flatten(n1);
		while(tn!=null) {
			System.out.println(tn.val);
			if(tn.left!=null) {
				System.out.println("Left is not null");
				return;
			}
			tn = tn.right;
		}
	}
	
	
	public TreeNode flatten(TreeNode a) {
		flat(a);
		return a;
	}
	
	public TreeNode flat(TreeNode a) {
		if(a == null) {
			return null;
		}
		if(a.left != null && a.right != null) {
			TreeNode nodel = flat(a.left);
			
			TreeNode noder = flat(a.right);
			
			nodel.right = a.right; 
			nodel.left = null;
			a.right = a.left;
			a.left = null;
			return noder;
			
		}
		if(a.left == null && a.right != null) {
			TreeNode noder = flat(a.right);
			return noder;
		}
		
		if(a.left != null && a.right == null) {
			TreeNode nodel = flat(a.left);
			a.right = a.left;
			a.left = null;
			return nodel;
		}
		return a;
	}

}
