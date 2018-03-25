package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class SetMatrixZeros {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		int n = inp.nextInt();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<n;j++) {
				list.add(inp.nextInt());
			}
			a.add(list);
		}
		
		setZeroes(a);
		for(ArrayList<Integer> list:a) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println();
		}
		inp.close();
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		int m = a.get(0).size();
		int[] rows = new int[n];
		int[] column = new int[m];
		for(int i=0;i<n;i++) {
			rows[i] = 1;
		}
		for(int i=0;i<m;i++) {
		    
			column[i] = 1;
		}
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a.get(i).get(j)==0) {
					rows[i] = 0;
					column[j] = 0;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(rows[i] == 0) {
				for(int j=0;j<m;j++) {
					a.get(i).set(j, 0);
				}
			}
		}
		for(int i=0;i<m;i++) {
			if(column[i]==0) {
				for(int j=0;j<n;j++) {
					a.get(j).set(i, 0);
				}
			}
		}
		
	}

}
