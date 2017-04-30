package com.code.hackerrank.java;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		if(a % 2==1 || (a % 2==0 && a>=6 && a<=20)) {
			System.out.println("Weird");
		} else{
				System.out.println("Not Weird");
		}
		inp.close();
		

	}

}
