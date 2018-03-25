package com.code.dp.problems;

import java.util.Scanner;

public class WineProblem {
	static int[][] solution = new int[10][10];
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++)
				solution[i][j] = 0;
		}
		Scanner inp = new Scanner(System.in);
		int numberOfWine = inp.nextInt();
		int[] wineArray = new int[numberOfWine+1];
		for(int i=1;i<=numberOfWine;i++) {
			wineArray[i] = inp.nextInt();
		}
		System.out.println(getProfit(1,1,numberOfWine,wineArray));
		inp.close();
	}

	private static int getProfit(int year, int f, int l, int[] wineArray) {
		if(f>l || l>=wineArray.length)
			return 0;
		if(solution[f][l]>0)
			return solution[f][l];
		
		 int tmp =  Math.max(getProfit(year+1, f+1, l,wineArray)+ year*wineArray[f],
				getProfit(year+1, f, l+1,wineArray)+ year*wineArray[l]);
		 solution[f][l] =tmp;
		 return tmp;
	}

}
