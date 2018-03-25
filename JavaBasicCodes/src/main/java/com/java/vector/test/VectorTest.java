package com.java.vector.test;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<Object>();
		v.add(5);
		v.add("hiii");
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		
	}

}
