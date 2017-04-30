package com.code.interview.bit;

import java.util.ArrayList;

public class GeneratePascalTriangleRows {
	public static void main(String[] args) {
		int n = 50;
		ArrayList<ArrayList<Integer>> pascal = generate(n);
		int tmp =1;
		while(tmp<=n) {
			for(int i=0;i<tmp;i++) {
				System.out.print(pascal.get(tmp-1).get(i)+" ");
			}
			System.out.println();
			tmp++;
		}
	}
	
	public static ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> pascal = new ArrayList<ArrayList<Integer>>();
		if(a==0)
			return pascal;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		pascal.add(list);
		if(a==1)
			return pascal;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(1);
		pascal.add(list1);
		if(a == 2)
			return pascal;
		int rows = 3;
		while(rows<=a) {
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			list2.add(1);
			int cnt = pascal.get(rows-2).size();
			int i =1;
			while(i<cnt) {
				list2.add(pascal.get(rows-2).get(i)+pascal.get(rows-2).get(i-1));
				i++;
			}
			list2.add(1);
			pascal.add(list2);
			rows++;
		}
		
		
		return pascal;
	}

}
