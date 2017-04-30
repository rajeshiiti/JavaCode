package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Stack;


public class TreeZigZagTravarsal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		if(a==null) {
			return ans;
		}
		stack.push(a);
		boolean bl = true;
		while(true) {
			Stack<TreeNode> stack1 = new Stack<TreeNode>();
			ArrayList<Integer> list = new ArrayList<Integer>();
			while(!stack.isEmpty()) {
				TreeNode node = stack.pop();
				if(bl) {
					if(node.left !=null) {
						stack1.push(node.left);
					}
					if(node.right!=null) {
						stack1.push(node.right);
					}
				} else {
					if(node.right!=null) {
						stack1.push(node.right);
					}
					if(node.left !=null) {
						stack1.push(node.left);
					}
				}
				list.add(node.val);
			}
			if(bl) {
				bl = false;
			} else {
				bl = true;
			}
			ans.add(list);
			if(stack1.isEmpty()) {
				return ans;
			} else {
				stack = stack1;
			}
		}
	}

}
