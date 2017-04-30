package com.effective.java.item.one;

/*
 * This is immutable class
 * it's object can not be manipulated from outside the class
 */
public class ImmutableClass {
	private final int value;
	
	public ImmutableClass(int i) {
		value=i;
	}
	
	public int getValue() {
		return value;
	}

}
