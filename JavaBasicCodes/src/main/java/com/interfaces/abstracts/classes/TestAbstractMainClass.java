package com.interfaces.abstracts.classes;

public class TestAbstractMainClass extends TestAbstractClass{
	public static void main(String[] args) {
		TestAbstractMainClass mainClass = new TestAbstractMainClass();
		TestAbstractClass poly = new TestAbstractMainClass(); 
		mainClass.printSum();;
		poly.printSum();
		TestAbstractClass poly2 = new TestAbstractClassMain2();
		poly2.printSum();
	}

	@Override
	void doOperation() {
		super.a = 4;
		super.b = 6;
		super.sum =super.a + super.b;
		//System.out.println(super.sum);
	}
	
	public void printSum() {
		doOperation();
		System.out.println("total sum: "+super.sum);
	}

}
