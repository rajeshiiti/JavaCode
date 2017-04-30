package com.java.generic.classes;

public class MultipleTypeParameter<K,V> implements MultiplePair<K, V>{

	private K key;
	private V value;
	
	public MultipleTypeParameter(K k, V v) {
		this.key = k;
		this.value = v;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}
