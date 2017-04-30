package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class NextPermutation {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++ ){
			a.add(inp.nextInt());
		}
		nextPermutation(a);
		for(int i=0;i<n;i++){
			System.out.print(a.get(i)+" ");
		}
		inp.close();
	}
	
	public static void nextPermutation(ArrayList<Integer> a) {
		boolean b= false;
		for(int i=a.size()-2;i>=0;i--) {
			if(a.get(i)<a.get(i+1) &&!b) {
				int tmp = a.get(i);
				a.set(i, a.get(i+1));
				a.set(i+1, tmp);
				break;
			}
		}
		if(!b) {
			int i=0;
			int j=a.size()-1;
			while(i<j) {
				int tmp = a.get(i);
				a.set(i, a.get(j));
				a.set(j, tmp);
				i++;j--;
			}
		}
	}
}
