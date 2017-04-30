package com.java.generic.classes;

public class BoxMainClassWithObject {

	public static void main(String[] args) {
		
		BoxClassWithObject boxClassWithObject = new BoxClassWithObject();
		boxClassWithObject.setObject(new Integer(12));
		System.out.println((String)boxClassWithObject.getObject());
		
	}

}
