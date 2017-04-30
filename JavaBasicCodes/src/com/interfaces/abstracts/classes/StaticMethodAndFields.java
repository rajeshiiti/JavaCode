package com.interfaces.abstracts.classes;

public class StaticMethodAndFields {
	public static void main(String[] args) {
		StaticMethodAndFields staticMethodAndFields = new StaticMethodAndFields();
		printStatic();
		staticMethodAndFields.printNonStatic();
	}
	public static int a=1;
	int b=2;
	
	public static void printStatic() {
		System.out.println(a);
	}
	
	public void printNonStatic() {
		System.out.println(a);
		System.out.println(b);
	}

}
