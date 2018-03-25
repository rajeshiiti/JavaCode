package com.interfaces.abstracts.classes;

public abstract class TestAbstractClass {
	int a;
	int b;
	int sum;
	public int getA() {
		return this.sum;
	}
	abstract void doOperation();
	public void printSum() {
		doOperation();
		System.out.println(this.sum);
	}

}
