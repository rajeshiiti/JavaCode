package com.code.hackerrank.java;

import java.util.Scanner;

public class StaticClass {
	private static int B,H;
	private static boolean flag=true;
	static {
	    Scanner inp = new Scanner(System.in);
	    B=inp.nextInt();
	    H=inp.nextInt();
	    if(B<0 || H<0) {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag=false;
	    }
	    inp.close();
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
