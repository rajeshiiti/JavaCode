package com.java.exception;

public class ThrowException {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		if(b==0) {
			throw new DivideByZeroException("can't divide by zero"); 
		} else {
			System.out.println(a/b);
		}
	}
}
class DivideByZeroException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 738759187031341248L;
	public DivideByZeroException() {
		super();
	}
	public DivideByZeroException(String message) {
		super(message);
	}
}