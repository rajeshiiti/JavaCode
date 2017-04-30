package com.code.hackerrank.java;

import java.math.BigInteger;
import java.util.Scanner;

public class DataTypeInJava {
	public static void main(String[] args) {
		
		BigInteger big1=new BigInteger("-128");
		BigInteger big2=new BigInteger("127");
		BigInteger big3=new BigInteger("-32768");
		BigInteger big4=new BigInteger("32767");
		BigInteger big5=new BigInteger("-2147483648");
		BigInteger big6=new BigInteger("2147483647");
		BigInteger big7=new BigInteger("-9223372036854775808");
		BigInteger big8=new BigInteger("9223372036854775807");
		Scanner inp = new Scanner(System.in);
		int tp=inp.nextInt();
		while(tp>0) {
			BigInteger big= inp.nextBigInteger();
			if(big.compareTo(big1)>=0 && big.compareTo(big2)<=0) {
				System.out.println(big+" can be fitted in:");
				System.out.println("* byte");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			} else if(big.compareTo(big3)>=0 && big.compareTo(big4)<=0) {
				System.out.println(big+" can be fitted in:");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
				
			} else if(big.compareTo(big5)>=0 && big.compareTo(big6)<=0) {
				System.out.println(big+" can be fitted in:");
				System.out.println("* int");
				System.out.println("* long");
				
			} else if(big.compareTo(big7)>=0 && big.compareTo(big8)<=0) {
				System.out.println(big+" can be fitted in:");
				System.out.println("* long");
			} else {
				System.out.println(big+" can't be fitted anywhere.");
			}
			tp--;
		}
		inp.close();
	}
	
	
	

}
