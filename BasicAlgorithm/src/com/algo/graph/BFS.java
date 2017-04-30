package com.algo.graph;

import java.util.Stack;


public class BFS {
	public static void main(String[] args) {
		Stack stack = new Stack();
		bfs();
	}
	public static void bfs() {
		
	}
	private static Node[] getInputList() {
		Node[] nodes = new Node[11];
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		Node node10 = new Node(10);
		
		node1.list.add(node2);
		node1.list.add(node3);
		
		node2.list.add(node1);
		node2.list.add(node3);
		node2.list.add(node4);
		node2.list.add(node5);
		
		node3.list.add(node1);
		node3.list.add(node4);
		node3.list.add(node6);
		node3.list.add(node2);
		
		node4.list.add(node2);
		node4.list.add(node3);
		node4.list.add(node7);
		node4.list.add(node5);
		
		node5.list.add(node10);
		node5.list.add(node9);
		node5.list.add(node4);
		node5.list.add(node2);
		
		node6.list.add(node3);
		
		node7.list.add(node4);
		node7.list.add(node8);

		node8.list.add(node7);
		node8.list.add(node9);
		
		node9.list.add(node5);
		node9.list.add(node8);
		
		node10.list.add(node5);
		
		nodes[1] = node1;
		nodes[2] = node2;
		nodes[3] = node3;
		nodes[4] = node4;
		nodes[5] = node5;
		nodes[6] = node6;
		nodes[7] = node7;
		nodes[8] = node8;
		nodes[9] = node9;
		nodes[10] = node10;	
		
		return nodes;
	}
	

}
