package com.effective.java.item.one;

/*
 * Here we are using public static factory method to get instance of a class
 * Rather than an public constructor 
 */
public class StaticFactoryMethodRatherThanConstructor {
	
	public static StaticFactoryMethodRatherThanConstructor getInstance() {
		return new StaticFactoryMethodRatherThanConstructor();
		
	}
}
