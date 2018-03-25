package com.code.interview.bit;

import java.util.ArrayList;

public class SpiralMatrix {
	public static void main(String[] args) {
		int n = 10;
		ArrayList<ArrayList<Integer>> spiralMatrix = generateMatrix(n);
		for(ArrayList<Integer> list: spiralMatrix) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		int[][] matrix = new int[a][a];
		int i=0,j=0;
		int cnt = 0;
		int tmp =1;
		int rs = 0,re = a,cs = 0,ce=a;
		while(cnt<a*a) {
			while(cnt<a*a && j<ce) {
				matrix[i][j] = tmp;
				tmp++;
				j++;
				cnt++;
			}
			rs++;
			i++;
			j--;
			while(cnt<a*a && i<re) {
				matrix[i][j] = tmp;
				tmp++;
				i++;
				cnt++;
			}
			ce--;
			i--;
			j--;
			while(cnt<a*a && j>=cs) {
				matrix[i][j] = tmp;
				tmp++;
				j--;
				cnt++;
			}
			re--;
			i--;
			j++;
			while(cnt<a*a && i>=rs) {
				matrix[i][j] = tmp;
				tmp++;
				i--;
				cnt++;
			}
			cs++;
			i++;
			j++;

		}
		ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
		for(int ii=0;ii<a;ii++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int jj=0;jj<a;jj++) {
				list.add(matrix[ii][jj]);
			}
			ans.add(list);
		}
		return ans;
	}

}
