package com.code.dp.problems;

import java.util.Scanner;

public class MinimumCoinChangeTopDown {
	static int tmp =0;
	static int[] miniCoin = new int[1000];

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int amount = inp.nextInt();
		for(int i=0;i<=amount;i++) {
			miniCoin[i] = 0;
		}
		int[] coins = new int[n+1];
		for(int i=1;i<=n;i++) {
			coins[i] = inp.nextInt();
		}
		System.out.println(getMinimumCoin(amount,coins));
		System.out.println(tmp);
		inp.close();
	}

	private static int getMinimumCoin(int amount, int[] coins) {
		if(amount==0)
			return 0;
		if(miniCoin[amount]>0)
			return miniCoin[amount];
		int mini =amount;
		
		for(int i=1;i<coins.length;i++) {
			tmp++;
			if(amount>=coins[i]) {
				miniCoin[amount-coins[i]]= getMinimumCoin(amount-coins[i], coins);
				mini = Math.min(mini, miniCoin[amount-coins[i]]+1);
			}
		}
		miniCoin[amount] = mini;
		return mini;
	}

}
