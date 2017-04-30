package com.java.memory;

public class StringPool {
	public static void main(String[] args) {
		String one = "hello";
		String two = "hello";
		
		if(one == two) {
			System.out.println("they are same object");
		} else {
			System.out.println("they are different object");
		}
		
		
		String three = new Integer(10).toString();
		String four = "10";
		// This happen because string three does not put in pool
		// So When four is created this make different object
		if(three == four) {
			System.out.println("they are same object");
		} else {
			System.out.println("they are different object");
		}
		if(three.equals(four)) {
			System.out.println("they contain same value");
		}
	}

}
