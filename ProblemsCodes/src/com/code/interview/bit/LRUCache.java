package com.code.interview.bit;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	public static void main(String[] args) {
		//6 2 S 2 1 S 1 1 S 2 3 S 4 1 G 1 G 2 
		LRUCache cache = new LRUCache(2);
		cache.set(2, 1);
		cache.set(1, 1);
		cache.set(2, 3);
		cache.set(4, 1);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
	}
	
	
	/*
	 * capacity = 2
         set(1, 10)
         set(5, 12)
         get(5)        returns 12
         get(1)        returns 10
         get(10)       returns -1
         set(6, 14)    this pushes out key = 5 as LRU is full. 
         get(5)        returns -1 
	 */
	class Node {
		int value;
		int key;
		Node next;
		Node prev;
	}
    public int get(int key) {
		if(map.containsKey(key)) {
			Node node = map.get(key);
			if(node.next!=null) {
				if(node.prev!=null) {
					node.next.prev = node.prev;
					node.prev.next = node.next;
					node.prev = null;
					this.head.prev = node;
					node.next = this.head;
					this.head = node;
				}
			} else if(node.prev!=null) {
				node.prev.next = null;
				tail = node.prev;
				node.prev = null;
				this.head.prev = node;
				node.next = this.head;
				this.head = node;
			}
			return map.get(key).value;
		} else {
			return -1;
		}
    }
    
    public void set(int key, int value) {
    	
    	Node node = new Node();
		node.value = value;
		node.prev = null;
		node.next = null;
		node.key = key;
		if(capacity == 1) {
			map = new HashMap<Integer, LRUCache.Node>();
			map.put(key, node);
			head = node;
			tail = node;
			return;
		}
        if(!map.containsKey(key)) {
        	if(map.size()<capacity) {
        		if(this.head==null) {
        			this.head = node;
        			tail = node;
        		} else {
        			node.next = this.head;
        			this.head.prev = node;
        			this.head = node;
        		}
        	} else {
        		map.remove(tail.key);
        		if(tail.prev==null) {
        			head = null;
        			tail = null;
        		} else {
        			tail.prev.next = null;
        			tail = tail.prev;
        		}
        		if(head==null) {
        			head = node;
        			tail = node;
        		} else {
        			node.next = this.head;
        			this.head.prev = node;
        			this.head = node;
        		}
        	}
        	map.put(key, node);
        } else {
        	Node node1 = map.get(key);
        	map.remove(node1.key);
        	if(node1.next!=null) {
				if(node1.prev!=null) {
					node1.next.prev = node1.prev;
					node1.prev.next = node1.next;
					node.next = this.head;
        			this.head.prev = node;
        			this.head = node;
        			map.put(key, node);
				} else{
					this.head.next.prev = node;
					node.next = this.head.next;
        			this.head = node;
        			map.put(key, node);
					return;
				}
			} else if(node1.prev!=null) {
				node1.prev.next = null;
				tail = node1.prev;
				node.next = this.head;
    			this.head.prev = node;
    			this.head = node;
    			map.put(key, node);
			} else {
    			this.head = node;
    			this.tail = node;
    			map.put(key, node);
				return;
			}
        }
    }
    public Node head;
	public Node tail;
	public int capacity;
	Map<Integer,Node> map = null;
	public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = null;
        this.tail = null;
        this.map = new HashMap<Integer,Node>();
    }

}
