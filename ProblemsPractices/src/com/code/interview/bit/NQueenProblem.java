package com.code.interview.bit;

import java.util.ArrayList;

public class NQueenProblem {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> ans= solveNQueens(4);
		for(ArrayList<String> ll : ans) {
			for(String str:ll) {
				System.out.print(str);
			}
			System.out.println();
		}
		
	}
	
	public static ArrayList<ArrayList<String>> solveNQueens(int a) {
		ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
		int[][] block = new int[a+1][a+1];
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				block[i][j] = 1;
			}
		}
		nQueen(ans,new ArrayList<ArrayList<String>>(),block,1,a,0);
		ArrayList<ArrayList<String>> ans2 = new ArrayList<ArrayList<String>>();
		int tmp =0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ans.size();i++) {
			for(int j=0;j<ans.get(i).size();j++) {
				sb.append(ans.get(i).get(j));
			}
			tmp++;
			if(tmp==a) {
				ArrayList<String> al = new ArrayList<String>();
				al.add(sb.toString().trim());
				ans2.add(al);
				sb = new StringBuilder();
				tmp = 0;
			} else {
				sb.append(" ");
			}
		}
		return ans2;
	}
	
	
	
	
	
	private static  void nQueen(ArrayList<ArrayList<String>> ans, 
			ArrayList<ArrayList<String>> tmp, 
			int[][] block, int row, int a, int cnt) {
		if(cnt==a) {
			ans.addAll(tmp);
			return;
		}
		if(row==1) {
			tmp = new ArrayList<ArrayList<String>>();
		}
		for(int i=1;i<=a;i++) {
			if(isQueenCanbePlaced(row, i, block)) {
				ArrayList<String> ll = new ArrayList<String>();
				for(int j=1;j<=a;j++) {
					if(j==i) {
						ll.add("Q");
					} else {
						ll.add(".");
					}
				}
				block[row][i] = 0;
				tmp.add(ll);
				nQueen(ans, tmp, block, row+1, a, cnt+1);
				tmp.remove(tmp.size()-1);
				block[row][i] = 1;
			}
		}
	}





	public static boolean isQueenCanbePlaced(int row,int column,int[][] block) {
		int i = row-1;
		int j = column;
		while(i>0) {
			if(block[i][j]==0) {
				return false;
			}
			i--;
		}
		i = row-1;
		j = column+1;
		while(i > 0 && j<block.length) {
			if(block[i][j]==0) {
				return false;
			}
			i--;
			j++;
		}
		i = row-1;
		j = column-1;
		while(i > 0 && j>0) {
			if(block[i][j]==0) {
				return false;
			}
			i--;
			j--;
		}
		
		
		return true;
	}

}
