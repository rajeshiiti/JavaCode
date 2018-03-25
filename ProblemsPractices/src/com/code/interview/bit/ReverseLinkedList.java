package com.code.interview.bit;

public class ReverseLinkedList {
	static Node1 rHead = null;
	public static void main(String[] args) {
		Node1 head = new Node1(2);
		Node1 node1 = new Node1(4);
		head.next = node1;
		Node1 node2 = new Node1(5);
		node1.next = node2;
		Node1 node3 = new Node1(2);
		node2.next = node3;
		Node1 node4 = new Node1(8);
		node3.next = node4;
		Node1 tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.value);
			tmp = tmp.next;
		}
		head = reverseLinkedList(head);
		head.next = null;
		head = rHead;
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
	public static Node1 reverseLinkedList(Node1 head) {
		if(head.next!=null) {
			Node1 tmp = reverseLinkedList(head.next);
			tmp.next = head;
		} else {
			rHead = head;
		}
		return head;
		
	}
}

class Node1 {
	int value;
	Node1 next;
	Node1 (int value) {
		this.value = value;
		this.next = null;
	}
}
