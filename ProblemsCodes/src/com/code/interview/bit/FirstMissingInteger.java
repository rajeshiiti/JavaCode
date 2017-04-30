package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstMissingInteger {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		System.out.println(firstMissingPositive(list));
	}
	public static int firstMissingPositive(ArrayList<Integer> a) {
		int n = a.size();
	    int j=0;
	    // Segregating +ve and -ve
	    for(int i=0;i<n;i++) {
	    	if(a.get(i)>0) {
	    		int tmp = a.get(j);
	    		a.set(j, a.get(i));
	    		a.set(i,tmp);
	    		j++;
	    	}
	    }
	    for(int i=0;i<j;i++) {
	    	if(Math.abs(a.get(i))-1<j && a.get(Math.abs(a.get(i))-1)>0) {
	    		int tmp = a.get(Math.abs(a.get(i))-1);
	    		a.set(Math.abs(a.get(i))-1,-tmp);
	    	}
	    }
	    for(int i=0;i<j;i++)
	    	if(a.get(i)>0)
	    		return i+1; 
	    
	    return j+1;
	}

}
