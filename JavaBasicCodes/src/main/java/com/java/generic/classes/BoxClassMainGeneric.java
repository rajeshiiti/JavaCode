package com.java.generic.classes;

public class BoxClassMainGeneric {
	
	public static void main(String[] args) {
		BoxClassGeneric<String> boxClassGeneric = new BoxClassGeneric<String>();
		boxClassGeneric.setObject("test");
		System.out.println(boxClassGeneric.getObject());
		
		BoxClassGeneric box = boxClassGeneric;
		BoxClassGeneric box1 = new BoxClassGeneric();
		
		BoxClassGeneric<String> box2 = box1; 
	}

}
