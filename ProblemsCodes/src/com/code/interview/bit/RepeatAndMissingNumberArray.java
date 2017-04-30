package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatAndMissingNumberArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		ArrayList<Integer> ansList = repeatedNumber(list);
	}
	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    long n =(long)a.size(); 
	    long sum1 = 0;
	    long sum2 = (n*(n+1))/2;
	    long sum3 = 0;
	    long sum4 = (n*(n+1)*(2*n+1))/6;
	    long mis,dup;
	    for(int i=0;i<a.size();i++) {
	        sum1 = sum1 + (long)a.get(i);
	        sum3 = sum3 + ((long)a.get(i))*((long)a.get(i));
	    }
	    sum1 = sum1-sum2;
	    sum3 = sum3-sum4;
	    
	    dup =  sum1/2 +(sum3/sum1)/2;
	    mis = dup - sum1;
	    ArrayList<Integer> list= new ArrayList<Integer>();
	    list.add((int)dup);
	    list.add((int)mis);
	    return list;
	    
	}

}
