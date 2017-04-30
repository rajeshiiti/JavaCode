package com.interfaces.abstracts.classes;

public class TestAbstractClassMain2 extends TestAbstractClass{

	@Override
	void doOperation() {
		super.a = 4;
		super.b = 2;
		super.sum = super.a+super.b;
	}
	

}
