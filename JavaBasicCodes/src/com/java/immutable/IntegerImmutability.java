package com.java.immutable;

public class IntegerImmutability {
	public static void main(String[] args) {
		Integer inte1 = new Integer(23);
		Integer inte2 = inte1;
		System.out.println(inte1+" "+inte2);
		
		inte1 = 32;
		System.out.println(inte1+" "+inte2);
		
		int in1 = 23;
		int in2 = in1;
		System.out.println(in1+" "+in2);
		in1 = 32;
		System.out.println(in1+" "+in2);
	}

}
