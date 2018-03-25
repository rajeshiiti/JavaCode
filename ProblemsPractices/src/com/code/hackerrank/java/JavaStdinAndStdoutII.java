package com.code.hackerrank.java;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a=inp.nextInt();
		
		double b= inp.nextDouble();
	
		inp.nextLine();
		String str = inp.nextLine();

		System.out.println("String: "+str);
		System.out.println("Double: "+b);
		System.out.println("Int: "+a);
		inp.close();

	}

}
