package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DiffK {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list  = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		System.out.println(diffPossible(list, 0));
		inp.close();
	}
	public static int diffPossible(ArrayList<Integer> a, int b) { 
	   for(int i=0;i<a.size();i++) {
		   int tmp = b+a.get(i);
		   int index = Collections.binarySearch(a, tmp);
		   if(index>=0 && i!=index) {
			   return 1;
		   }
	   }
	   return 0;
	}

}
