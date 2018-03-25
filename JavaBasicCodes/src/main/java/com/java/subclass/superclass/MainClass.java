package com.java.subclass.superclass;


public class MainClass {
	
	public static void main(String[] args) {
		/*SubClass subClass = new SubClass("nk");
		System.out.println(subClass.getSubClassName());
		System.out.println(subClass.getSuperClassName());*/
		
		JavaClassFactoryMethod factoryMethod = JavaClassFactoryMethod.getInstance("test");
		System.out.println(factoryMethod.getName());
	}
}
