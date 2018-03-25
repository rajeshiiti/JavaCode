package com.code.lru.cache;

import java.util.HashMap;
import java.util.Map;

public class DoublyLinkedList {
	private Map<String,Node> map; 
	private int cacheSize;
	private Node head;
	private Node tail;
	public DoublyLinkedList(int cacheSize) {
		this.map = new HashMap<String,Node>();
		this.cacheSize = cacheSize;
	}
	
	public String accessPage(String url) {
		if(map.isEmpty()) {
			Node node = new Node(url);
			node.setNext(null);
			node.setPrev(null);
			tail = node;
			head = node;
			map.put(url, node);
			return head.getData();
		}
		if(map.containsKey(url) && map.get(url)!=null) {
			Node node = map.get(url);
			if(node.getUrl().equals(head.getUrl())) {
				return node.getData();
			} else if(node.getUrl().equals(tail.getUrl())) {
				node.getPrev().setNext(null);
				tail = node.getPrev();
				node.setNext(head);
				node.setPrev(null);
				head.setPrev(node);
				head = node;
			} else {
				node.getNext().setPrev(node.getPrev());
				node.getPrev().setNext(node.getNext());
				head.setPrev(node);
				node.setNext(head);
				node.setPrev(null);
				head = node;
			}
		} else {
			if(map.size()==cacheSize) {
				map.remove(tail.getData());
				tail.getPrev().setNext(null);
				tail = tail.getPrev();
				addNewNode(url);
			} else {
				addNewNode(url);
			}
		}
		return head.getData();
	}

	public void addNewNode(String url) {
		Node node = new Node(url);
		node.setPrev(null);
		node.setNext(head);
		head.setPrev(node);
		head = node;
		map.put(url, head);
	}
	
	public void printAllPages() {
		Node tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.getUrl()+": "+tmp.getData());
			tmp = tmp.getNext();
		}
	}

}
