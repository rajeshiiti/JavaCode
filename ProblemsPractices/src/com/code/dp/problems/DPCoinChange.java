package com.code.dp.problems;

import java.util.Scanner;

public class DPCoinChange {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int amount = inp.nextInt();
		int m = inp.nextInt();
		int[] coinArray = new int[m+1];
		for(int i=1;i<=m;i++) {
			coinArray[i] = inp.nextInt();
		}
		System.out.println(getNumberOfWays(coinArray,amount,m));
		inp.close();
		
	}

	private static int getNumberOfWays(int[] coinArray, int amount, int m) {
		int[][] solution = new int[m+1][amount+1];
		for(int i=0;i<=m;i++) {
			solution[i][0] = 1;
		}
		for(int i=1;i<=amount;i++) {
			solution[0][i] = 0;
		}
		
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=amount;j++) {
				if(j>=coinArray[i]) {
					solution[i][j] = solution[i-1][j] + solution[i][j-coinArray[i]];
				} else {
					solution[i][j] = solution[i-1][j];
				}
			}
		}
		return solution[m][amount];
	}
	

}
