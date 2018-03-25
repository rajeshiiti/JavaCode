package com.java.exception;

public class ThrowingException {
	public static void main(String[] args) {
		isDivide();
		//System.out.println(divide(3,0));
	}
	public static void isDivide() {
		System.out.println(divide(12, 0));
	}
	public static int divide(int numberToDivide, int numberToDivideBy) {
		int tmp=0;
		try {
			tmp=  numberToDivide/numberToDivideBy;
		} catch(ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		return tmp;
		
	}

}
