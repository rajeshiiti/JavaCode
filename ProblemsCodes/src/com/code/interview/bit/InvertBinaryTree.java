package com.code.interview.bit;

public class InvertBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	
	public static void main(String[] args) {
		
	}
	
	public TreeNode invertTree(TreeNode root) {
		invertBTree(root);
		return root;
    }

	private void invertBTree(TreeNode root) {
		if(root.left!= null && root.right != null) {
			TreeNode node = root.left;
			root.left = root.right;
			root.right = node;
			invertBTree(root.left);
			invertBTree(root.right);
		} else if(root.left== null && root.right != null) {
			root.left = root.right;
			root.right = null;
			invertBTree(root.left);
		} else if(root.left!= null && root.right == null){
			root.right = root.left;
			root.left = null;
			invertBTree(root.right);
		}
		
	}

}
