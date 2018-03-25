package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;


public class PreeOrderTravarsal {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	} 
		      
	public ArrayList<Integer> preorderTraversal(TreeNode a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(a==null) {
			return ans;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(a);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			ans.add(node.val);
			if(node.right!=null) {
				stack.push(node.right);
			}
			if(node.left != null) {
				stack.push(node.left);
			}
		}
		return ans;
	}

}
