package com.algo.graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
	static int cnt = 0;
	public static void main(String[] args) {
		Node[] nodes = getInputList();
		for(int i=1;i<=10;i++){
			nodes[i].color=Color.WHITE;
			nodes[i].parent = -1;
		}
		
		for(int i=1;i<=10;i++) {
			if(nodes[i].color==Color.WHITE) {
				dfsVist(nodes[i]);
			}
		}
		for(int i=1;i<=10;i++) {
			System.out.println(nodes[i].index+" "+nodes[i].parent+" "+nodes[i].d+" "+nodes[i].f);
		}
		
		
	}

	private static void dfsVist(Node node) {
		cnt = cnt + 1;
		node.d = cnt ;
		System.out.println(node.index+" "+node.d);
		node.color = Color.BLACK;
		for(Node node1: node.list) {
			if(node1.color==Color.WHITE) {
				node1.parent = node.index;
				dfsVist(node1);
			}
		}
		cnt = cnt +1;
		node.f = cnt;
		System.out.println(node.index+" "+node.f);
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
class Node {
	int index;
	int parent;
	Color color;
	int d;
	int f;
	List<Node> list;
	public Node(int index) {
		this.index = index;
		list = new ArrayList<>();
		this.color = Color.WHITE;
	}
	
}
enum Color {
	WHITE,
	BLACK;
}
