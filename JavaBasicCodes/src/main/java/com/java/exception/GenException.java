package com.java.exception;

public class GenException {
	public static void main(String[] args) {
		GenException genException = new GenException();
		int c=genException.divide(6, 0);
		System.out.println(c);
	}
	
	public int divide(int a,int b) {
		int c = 0;
		try {
			c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

}
