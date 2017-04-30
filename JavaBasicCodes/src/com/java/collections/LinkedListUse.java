package com.java.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListUse {
	
	LinkedList<String> linkedList = new LinkedList<String>(); //Linked list extends to AbstractSequentialList and implements to List and Queue
	AbstractSequentialList<String> abstractSequentialList = new LinkedList<String>(); // AbstractSequentialList extends to AbstractCollection
	AbstractList<String> abstractList = new LinkedList<String>(); //AbstractList extends to AbstractCollection
	AbstractCollection<String> abstractCollection = new LinkedList<String>(); //AbstractCollection extends to Collection
	Collection<String> collection = new LinkedList<String>(); //
	List<String> list = new LinkedList<String>(); // List extends to Collection
	Deque<String> deque = new LinkedList<String>(); // Deque extends to Queue 
	Queue<String> queue = new LinkedList<String>(); // Queue extends to Collection
	
	/*
	 * Basic operation for linked list
	 */
	public void testLinkedList() {
		linkedList.add("as");
		linkedList.size();
		linkedList.iterator();
		linkedList.clear();
		linkedList.getFirst();
		linkedList.isEmpty();
		linkedList.addFirst("As");
		linkedList.remove("as");
		linkedList.contains("as");
		linkedList.removeFirst();
		linkedList.getLast();
	}
	
	
	
	
	

}
