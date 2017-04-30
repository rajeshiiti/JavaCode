package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WaveArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>(); 
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		ArrayList<Integer> list = wave(array);
		for(int i=0;i<n;i++) {
			System.out.print(list.get(i)+" ");
		}
		inp.close();
	}
	public static ArrayList<Integer> wave(ArrayList<Integer> a) {
		Collections.sort(a);
		for(int i=1;i<a.size();) {
			int tmp = a.get(i-1);
			a.set(i-1, a.get(i));
			a.set(i, tmp);
			i+=2;
		}
		return a;
	    
	}
	

}
