package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.List;

public class IsBst {

	public static void main(String[] args) {

	}
	 boolean checkBST(Node root) {
		 List<Integer> list = new ArrayList<Integer>();
		 checkingBST(root,list);
		 int size = list.size();
		 if(size == 1)
			 return true;
		 int idx = 1;
		 while(idx<size) {
			 if(list.get(idx-1)>=list.get(idx))
				 return false;
			 idx++;
		 }
		 return true;
	     
	    }
	 void checkingBST(Node node,List<Integer> list ) {
		 if(node.left!=null) {
			 checkingBST(node.left, list);
		 }
		 list.add(node.data);
		 if(node.right != null) {
			 checkBST(node.right);
		 }
	 }
	 

}

    class Node {
        int data;
        Node left;
        Node right;
     }


