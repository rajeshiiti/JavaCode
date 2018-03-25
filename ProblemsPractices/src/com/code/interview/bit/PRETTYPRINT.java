package com.code.interview.bit;

import java.util.ArrayList;

public class PRETTYPRINT {
	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> lists = prettyPrint(4);
		for(ArrayList<Integer> list:lists) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>> ();
		int[][] list = new int[2*a][2*a];
		int aa = (2*a-1)*(2*a-1);
		int i =1,j=1,tmp = 0, cnt = a,re = 2*a-1,ce = 2*a-1,rs =1,cs=1;
		while(tmp<aa) {
			while(tmp<=aa && j<=ce) {
				list[i][j] = cnt;
				j++;
				tmp++;
			}
			j--;
			rs++;
			i++;
			while(tmp<=aa && i<=re) {
				list[i][j] = cnt;
				i++;
				tmp++;
			}
			i--;
			ce--;
			j--;
			while(tmp<=aa && j>=cs) {
				list[i][j] = cnt;
				j--;
				tmp++;
			}
			i--;
			j++;
			re--;
			while(tmp<=aa && i>=rs) {
				list[i][j] = cnt;
				i--;
				tmp++;
			}
			i++;
			j++;
			cs++;
			cnt--;
		}
		for(int ii=1;ii<=2*a-1;ii++) {
			ArrayList<Integer> ll = new ArrayList<Integer>();
			for(int jj=1;jj<=2*a-1;jj++) {
				ll.add(list[ii][jj]);
			}
			lists.add(ll);
		}
			
		return lists;
	}

}
