package com.java.classInitializer;

public class MainClass1 {
	public static void main(String[] args) {
		TestClassInitializer1 initializer1 = new TestClassInitializer1();
		initializer1.classInitializer();
		
		TestClassInitializer1 initializer2 = new TestClassInitializer1();
		
		
		TestClassInitializer2 initializer12 = new TestClassInitializer2();
		//initializer12.classInitializer();
		TestClassInitializer2 initializer22 = new TestClassInitializer2();
	}

}
