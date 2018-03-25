package com.code.bit.manipulation;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 43;
		System.out.println(num1+ " "+num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println(num1+ " "+num2);
	}

}
