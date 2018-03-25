package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatingNumber {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		System.out.println(repeatedNumber(array));
		inp.close();
	}
	public static int repeatedNumber(final List<Integer> a) {
	    int[] A = new int[a.size()+1];
	    for(int i=0;i<=a.size();i++) {
	        A[i] = 0;
	    }
	    for(int i=0;i<a.size();i++) {
		    if(A[a.get(i)] == 0) {
		        A[a.get(i)]+=1;
		    } else {
		        return a.get(i);
		    }
		}
		return -1;
	}

}
