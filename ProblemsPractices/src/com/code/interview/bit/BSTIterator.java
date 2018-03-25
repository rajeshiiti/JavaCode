package com.code.interview.bit;

import java.util.Stack;


public class BSTIterator {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	private Stack<TreeNode> stack;
	private TreeNode currentNode;
	public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        this.currentNode = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (!stack.isEmpty() || currentNode!=null);
    }

    /** @return the next smallest number */
    public int next() {
        while(currentNode!=null) {
        	stack.push(currentNode);
        	currentNode = currentNode.left;
        }
        currentNode = stack.pop();
        int val = currentNode.val;
        currentNode = currentNode.right;
        return val;
    }

}
