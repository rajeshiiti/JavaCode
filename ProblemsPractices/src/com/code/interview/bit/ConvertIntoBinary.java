package com.code.interview.bit;

import java.util.Scanner;

public class ConvertIntoBinary {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		System.out.println(findDigitsInBinary(n));
		inp.close();
		
	}
	public static String findDigitsInBinary(int a) {
		char[] array = new char[32];
		int shift = 1;
		int index = 32;
		do {
			array[--index] = digit[a & shift];
			a>>>=shift;
		} while(a!=0);
		return new String(array,index,32-index);
	}
	public static char[] digit = {'0','1'};

}
