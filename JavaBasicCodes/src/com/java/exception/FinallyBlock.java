package com.java.exception;

public class FinallyBlock {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		System.out.println(divideNumber(a,b));
	}
	
	public static int divideNumber(int a, int b) {
		try{
			return a/b;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("I from final, Dude");
		}
		return 0;
		
	}

}
