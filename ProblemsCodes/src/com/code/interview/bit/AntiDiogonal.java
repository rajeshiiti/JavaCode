package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class AntiDiogonal {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<ArrayList<Integer>> antiDio = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<n;j++) {
				list.add(inp.nextInt());
			}
			antiDio.add(list);
		}
		ArrayList<ArrayList<Integer>> anti = diagonal(antiDio);
		for(ArrayList<Integer> list: anti) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println();
		}
	}
	
	
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> antiDio = new ArrayList<ArrayList<Integer>>();
		int size = a.size();
		int tmp = 0;
		int cnt = size+size-1;
		int i = 0, j =0;
		int ce = size-1;
		int rs = 0;
		for(int k = 0;k<cnt;k++) {
			ArrayList<Integer> array = new ArrayList<Integer>();
			antiDio.add(array);
		}
		while(tmp<size) {
			int index = rs;
			i=rs;
			j=0;
			while(j<=ce) {
				antiDio.get(index).add(a.get(i).get(j));
				j++;
				index++;
			}
			j--;
			i++;
			rs++;
			while(i<size) {
				antiDio.get(index).add(a.get(i).get(j));
				i++;
				index++;
			}
			ce--;
			tmp++;
		}
		
		
		
		return antiDio;
	}

}
