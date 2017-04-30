package com.java.subclass.superclass;

public class JavaClassFactoryMethod {
	private final String name;

	private JavaClassFactoryMethod(String name){
		this.name = name;
	}
	public String getName() { return name;}
	
	public static JavaClassFactoryMethod getInstance(String name) {
		return new JavaClassFactoryMethod(name);
	}
	

}
