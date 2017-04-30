package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class RearrangeArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			list.add(inp.nextInt());
		}
		arrange(list);
		for(int i=0;i<n;i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}
	public static void arrange(ArrayList<Integer> a) {
		for(int i=0;i<a.size();i++) {
			a.set(i, a.get(i)+ ((a.get(a.get(i)))%a.size()) *a.size() );
		}
		for(int i = 0;i<a.size();i++) {
			a.set(i, (a.get(i))/a.size());
		}
	}

}
