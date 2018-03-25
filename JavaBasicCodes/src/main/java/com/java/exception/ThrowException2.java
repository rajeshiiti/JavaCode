package com.java.exception;

public class ThrowException2 {
	
	public static void main(String[] args) {
		System.out.println(divide(2,0));
	}
	
	public static int divide(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("Can't divide by Zero");
		}
		return num1/num2;
	}

}
