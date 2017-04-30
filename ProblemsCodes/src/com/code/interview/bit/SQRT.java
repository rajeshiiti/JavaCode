package com.code.interview.bit;

public class SQRT {
	public static void main(String[] args) {
		System.out.println(sqrt(80));
	}
	public static int sqrt(int a) {
	    if(a<4) {
	        return 1;
	    } 
	    double squareRoot = a/2;
	    double g1;
	    do
	    {
	        g1=squareRoot;
	        squareRoot = (g1 + (a/g1))/2;
	        System.out.println(g1+" "+squareRoot);
	    }
	    while((g1-squareRoot)!=0);
	   
	    return (int) squareRoot;
	}

}
