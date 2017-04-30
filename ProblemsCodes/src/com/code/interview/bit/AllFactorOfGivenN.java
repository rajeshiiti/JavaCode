package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class AllFactorOfGivenN {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list = allFactors(n);
		for(Integer inte:list) {
			System.out.print(inte+" ");
		}
		inp.close();
	}
	public static ArrayList<Integer> allFactors(int a) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int n = (int) Math.sqrt(a);
		for(int i = 1;i<=n;i++) {
			if(a%i==0) {
				list1.add(i);
				list2.add(a/i);
			}
			
			
		}
		int tmp = list2.size()-1;
		while(tmp>=0) {
			list1.add(list2.get(tmp));
			tmp--;
		}
		return list1;
	    
	}

}