package com.code.interview.bit;

import java.util.ArrayList;

public class NextRightPointerTree {
	public class TreeLinkNode {
		int val;
		 TreeLinkNode left, right, next;
		 TreeLinkNode(int x) { val = x; }
		 }
	public void connect(TreeLinkNode root) {
		ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
		if(root==null) {
			return;
		}
		list.add(root);
		while(list.size()>0) {
			ArrayList<TreeLinkNode> list1 = new ArrayList<TreeLinkNode>();
			int i=0;
			while(i<list.size()) {
				if(list.get(i).left!=null) {
					list1.add(list.get(i).left);
				}
				if(list.get(i).right!=null) {
					list1.add(list.get(i).right);
				}
				if(i<list.size()-1) {
					list.get(i).next = list.get(i+1);
				}
				i++;
			}
			list = list1;
		}
	}

}
