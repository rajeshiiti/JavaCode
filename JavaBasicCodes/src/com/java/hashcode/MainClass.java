package com.java.hashcode;

public class MainClass {
	public static void main(String[] args) {
		HashCodeImplementation hashCode1 = new HashCodeImplementation(1);
		HashCodeImplementation hashCode2 = new HashCodeImplementation(1);
		System.out.println(hashCode1.hashCode()+" "+hashCode2.hashCode());
		System.out.println(hashCode1.equals(hashCode1));
		System.out.println(hashCode1.toString());
	}

}
