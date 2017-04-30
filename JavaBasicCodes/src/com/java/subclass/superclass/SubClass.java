package com.java.subclass.superclass;

public class SubClass extends SuperClass{
	private final String name;

	SubClass(String name) {
		super(name);
		this.name=name;
	}
	public String getSubClassName() { return name;}

}
