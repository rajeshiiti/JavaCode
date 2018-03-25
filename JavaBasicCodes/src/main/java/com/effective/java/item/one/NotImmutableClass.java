package com.effective.java.item.one;

import java.util.List;

/*
 * This is not immutable class 
 * In this we can manipulate list from outside the class
 */
public class NotImmutableClass<T> {
	private final List<T> list;
	
	public NotImmutableClass(List<T> list) {
		this.list=list;
	}
	
	public List<T> getList() {
		return list;
	}
		
}
