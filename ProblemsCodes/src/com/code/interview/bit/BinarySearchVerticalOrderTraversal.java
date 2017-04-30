package com.code.interview.bit;

import java.util.ArrayList;

public class BinarySearchVerticalOrderTraversal {
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
	     TreeNode(int x) { val = x; }
		}
	public static void main(String[] args) {
		BinarySearchVerticalOrderTraversal bs = new BinarySearchVerticalOrderTraversal();
		TreeNode n1 = bs.new TreeNode(1);
		TreeNode n2 = bs.new TreeNode(2);
		TreeNode n3 = bs.new TreeNode(3);
		TreeNode n4 = bs.new TreeNode(4);
		TreeNode n5 = bs.new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n5.left=n5.right=n4.left=n3.right=n2.left=n2.right=null;
		n3.left = n4;
		n4.right = n5;
		ArrayList<ArrayList<Integer>> ans = bs.verticalOrderTraversal(n1);
	}
	public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
		return verticalTraverse(A);
		
    }
	private ArrayList<ArrayList<Integer>> verticalTraverse(TreeNode a) {
		int leftMax = getLeftMax(a,0);
		int rightMax = getRightMax(a,0);
		int len = leftMax+rightMax+1;
		int mid = leftMax+1;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<len;i++) {
			ans.add(new ArrayList<Integer>());
		}
		getVerticalTraverse(ans,a,mid-1,len);
		return ans;
		
	}
	private void getVerticalTraverse(ArrayList<ArrayList<Integer>> ans,
			TreeNode a, int idx,int len) {
		if(a==null || a.val ==-1 || idx<0 || idx>=len) {
			return ;
		}
		ans.get(idx).add(a.val);
		if(a.left!=null) {
			getVerticalTraverse(ans, a.left, idx-1,len);
		}
		if(a.right!=null) {
			getVerticalTraverse(ans, a.right, idx+1,len);
		}
	}
	private int getRightMax(TreeNode a, int value) {
		int ans = value;
		if(a.left!=null) {
			ans = Math.max(value,getRightMax(a.left, value-1));
		}
		if(a.right!=null) {
			ans = Math.max(ans,getRightMax(a.right, value+1));
		}
		return ans;
	}
	private int getLeftMax(TreeNode a, int value) {
		int ans = value;
		if(a.left!=null) {
			ans = Math.max(value,getLeftMax(a.left, value+1));
		}
		if(a.right!=null) {
			ans = Math.max(ans,getLeftMax(a.right, value-1));
		}
		return ans;
	}

}
