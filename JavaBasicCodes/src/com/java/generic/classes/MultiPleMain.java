package com.java.generic.classes;

public class MultiPleMain {
	
	public static void main(String[] args) {
		MultipleTypeParameter<Integer, String> parameter = new MultipleTypeParameter<Integer, String>(1, "apple");
		MultipleTypeParameter<Integer, String> parameter1 = new MultipleTypeParameter<Integer, String>(2, "banana");
		MultipleTypeParameter<Integer, String> parameter2 = new MultipleTypeParameter<>(3, "orange");
		
		System.out.println(parameter.getKey()+" "+parameter.getValue());
		System.out.println(parameter1.getKey()+" "+parameter1.getValue());
		System.out.println(parameter2.getKey()+" "+parameter2.getValue());
	}

}
