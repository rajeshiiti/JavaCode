package com.java.hashcode;

public class HashMapCustum<Key,Value> {
	private int initialCapacity = 16;
	private Entry<Key, Value>[] table;
	
	public HashMapCustum() {
		table = new Entry[initialCapacity];
	}
	
	
	
	
	private int hash(Key key) {
		return Math.abs(key.hashCode()) % initialCapacity;
	}
	
	
	
	
	

	static class Entry<Key,Value> {
		Key key;
		Value value;
		Entry<Key,Value> next;
		public Entry(Key key,Value value,Entry<Key,Value> next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
		
	}
	
	
}
