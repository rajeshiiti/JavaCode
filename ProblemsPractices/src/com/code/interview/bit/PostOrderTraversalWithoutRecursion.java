package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;

import com.code.interview.bit.InorderTravasalWithoutRecursion.TreeNode;


public class PostOrderTraversalWithoutRecursion {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	}  
	
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode lastVisitedNode = null;
		while(!stack.isEmpty() || a!=null) {
			if(a!= null) {
				stack.push(a);
				a = a.left;
			} else {
				TreeNode peekNode = stack.peek();
				if(peekNode.right != null && lastVisitedNode != peekNode.right) {
					a = peekNode.right;
				} else {
					ans.add(peekNode.val);
					lastVisitedNode = stack.pop();
				}
			}
		}
		return ans;
	}

}
