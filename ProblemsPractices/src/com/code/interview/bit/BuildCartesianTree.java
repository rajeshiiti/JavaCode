package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BuildCartesianTree {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	 }
	 public TreeNode buildTree(ArrayList<Integer> a) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.size();i++) {
			map.put(a.get(i),i);
		}
		ArrayList<Integer> list = new ArrayList<Integer>(a);
		Collections.sort(list);
		if(a.size()==0) {
			return null;
		}
		TreeNode root = new TreeNode(list.get(0));
		root.left = null;
		root.right = null;
		for(int i=1;i<list.size();i++) {
			buildCartesianTree(map,root,list.get(i));
		}
		return root;
	        
	 }
	private void buildCartesianTree(Map<Integer, Integer> map, TreeNode root,
			int value) {
		if(map.get(root.val)>map.get(value)) {
			if(root.left==null) {
				TreeNode node = new TreeNode(value);
				node.left = node.right = null;
				root.left = node;
			} else {
				buildCartesianTree(map, root.left, value);
			}
		} else {
			if(root.right==null) {
				TreeNode node = new TreeNode(value);
				node.left=node.right = null;
				root.right = node;
			} else {
				buildCartesianTree(map, root.right, value);
			}
		}
		
	}
	

}
