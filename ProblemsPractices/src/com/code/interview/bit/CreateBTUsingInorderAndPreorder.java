package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CreateBTUsingInorderAndPreorder {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	/*
	 * A : [ 17, 12, 24, 13, 2, 22, 9, 20, 18, 23, 3, 15, 21, 10, 4, 11, 19, 14, 16, 7, 1, 5, 6, 8 ]
	   B : [ 17, 13, 2, 22, 24, 18, 20, 9, 15, 3, 11, 4, 10, 14, 16, 19, 1, 7, 21, 23, 12, 6, 8, 5 ]
	 */
	public static void main(String[] args) {
		Integer[] in = new Integer[]{17, 12, 24, 13, 2, 22, 9, 20, 18, 23, 3, 15, 21, 10, 4, 11, 19, 14, 16, 7, 1, 5, 6, 8};
		List<Integer> inorder = Arrays.asList(in);
		Integer[] or = new Integer[]{17, 13, 2, 22, 24, 18, 20, 9, 15, 3, 11, 4, 10, 14, 16, 19, 1, 7, 21, 23, 12, 6, 8, 5};
		List<Integer> postorder = Arrays.asList(or);
		CreateBTUsingInorderAnsPostOrderTravesal bs = new CreateBTUsingInorderAnsPostOrderTravesal();
		bs.buildTree(new ArrayList<Integer>(inorder), new ArrayList<Integer>(postorder));
	}
	public TreeNode buildTree(ArrayList<Integer> preorder, ArrayList<Integer> inorder) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<inorder.size();i++) {
			map.put(inorder.get(i), i);
		}
		TreeNode root = createBT(inorder,preorder,map,0,inorder.size()-1,0,preorder.size()-1); 
		return root;
	}
	private TreeNode createBT(ArrayList<Integer> inorder,
			ArrayList<Integer> postorder, Map<Integer, Integer> map, int il,
			int ir, int ol, int or) {
		if(il<ir) {
			TreeNode node = new TreeNode(postorder.get(ol));
			int index = map.get(postorder.get(ol));
			int oIndex = index-il;
			node.left = createBT(inorder, postorder, map, il, index-1, ol+1, ol+oIndex);
			node.right = createBT(inorder, postorder, map, index+1, ir, ol+oIndex+1, or);
			return node;
			
		} else if(il==ir) {
			TreeNode node = new TreeNode(postorder.get(or));
			node.left=node.right=null;
			return node;
		}
		return null;
	}

}
