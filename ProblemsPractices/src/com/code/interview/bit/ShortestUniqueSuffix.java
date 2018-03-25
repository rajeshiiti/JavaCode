package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Iterator;

public class ShortestUniqueSuffix {
	public static void main(String[] args) {
		// Input: [zebra, dog, duck, dove]
		ArrayList<String> a = new ArrayList<String>();
		a.add("zebra");
		a.add("dog");
		a.add("duck");
		a.add("dove");
		ArrayList<String> ans =new ShortestUniqueSuffix().prefix(a);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
		
	}
	
	public ArrayList<String> prefix(ArrayList<String> a) {
		Node root = new Node();
		for(int i=0;i<a.size();i++) {
			createTries(root, a.get(i));
		}
	
		ArrayList<String> aa = new ArrayList<String>();
		for(int i=0;i<a.size();i++) {
			int j = 0;
			String str = a.get(i);
			Node node = root.nodes[(int)str.charAt(j)];
			while(node.cnt>1) {
				j++;
				node = node.nodes[(int)str.charAt(j)];
			}
			aa.add(a.get(i).substring(0, j+1));
		}
		return aa;
	}

	public void createTries(Node node, String str) {
		int j = 0;
		while(j<str.length()) {
			int index = (int)str.charAt(j);
			if(node.nodes[index] == null) {
				Node node1 = new Node();
				node1.cnt +=1;
				node.nodes[index] = node1;
				node = node1;
			} else {
				node.nodes[index].cnt +=1;
				node = node.nodes[index];
			}
			j++;
		}
	}
	
	class Node {
		Node[] nodes;
		int cnt;
		public Node() {
			this.cnt = 0;
			this.nodes = new Node[256];
		}
	}

}
