package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;


public class LowestCommonAnccestorInBST {
	
	public static void main(String[] args) {
		LowestCommonAnccestorInBST lca = new LowestCommonAnccestorInBST();
		TreeNode node1 = lca.new TreeNode(4);
		TreeNode node2 = lca.new TreeNode(5);
		TreeNode node3 = lca.new TreeNode(8);
		TreeNode node4 = lca.new TreeNode(6);
		TreeNode node5 = lca.new TreeNode(1);
		TreeNode node6 = lca.new TreeNode(7);
		TreeNode node7 = lca.new TreeNode(0);
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = null;
		node2.right = node4;
		
		node3.left = node5;
		node3.right = node6;
		
		node4.left = node7;
		node4.right = null;
		
		node5.left = node5.right = null;
		
		node6.left = node6.right = null;
		
		node7.left = node7.right = null;
		
		System.out.println(lca.lca(node1, 14,14));
		
	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public int lca(TreeNode a, int val1, int val2) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		int tmp1 =getPath(a,val1,l1);
		int tmp2 =getPath(a,val2,l2);
		if(tmp1==-1 || tmp2==-1) {
			return -1;
		}
		int i = l1.size()-1;
		int j = l2.size()-1;
		int prev = l1.get(i);
		while(i>=0 && j>=0 && l1.get(i)==l2.get(j)) {
			prev = l1.get(i);
			i--;
			j--;
		}
		return prev;
	}
	private int getPath(TreeNode a, int val, List<Integer> l1) {
		if(a!=null) {
			if(a.val==val) {
				l1.add(a.val);
				return 1;
			}
			int tmp1 = getPath(a.left, val, l1);
			if(tmp1==1) {
				l1.add(a.val);
				return 1;
			}
			int tmp2 = getPath(a.right, val, l1);
			if(tmp2==1) {
				l1.add(a.val);
				return 1;
			}
		}
		return -1;
		
	}

}
