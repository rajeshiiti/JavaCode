package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTravasalWithoutRecursion {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	}    
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(a);
		boolean bl = true;
		while(!stack.isEmpty()) {
			if(bl) {
				if(stack.peek().left != null) {
					stack.push(stack.peek().left);
					continue;
				}
				TreeNode node = stack.pop();
				ans.add(node.val);
				if(node.right!=null) {
					stack.push(node.right);
					continue;
				}
				bl = false;
				
			} else {
				TreeNode node = stack.pop();
				ans.add(node.val);
				if(node.right!=null) {
					stack.push(node.right);
					bl = true;
					continue;
				}
				bl = false;
			}
		}
		return ans;
	}
}
