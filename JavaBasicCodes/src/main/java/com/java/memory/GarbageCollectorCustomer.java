package com.java.memory;

public class GarbageCollectorCustomer {
	private String name;
	
	public GarbageCollectorCustomer(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}

}
