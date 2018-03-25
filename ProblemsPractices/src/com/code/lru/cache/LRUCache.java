package com.code.lru.cache;


public class LRUCache implements ILRUCache{
	private DoublyLinkedList doublyLinkedList;
	public LRUCache() {
		this.doublyLinkedList = new DoublyLinkedList(5);
	}

	@Override
	public String accessPage(String url) {
		return doublyLinkedList.accessPage(url);
	}

	@Override
	public void printAllPage() {
		doublyLinkedList.printAllPages();
	}
}