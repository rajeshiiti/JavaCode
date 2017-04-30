package com.code.dp.problems;

import java.util.Scanner;

public class MinimumCoinChangeBottomUp {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int amount = inp.nextInt();
		int coins[] =new int[n+1];
		for(int i=1;i<=n;i++) {
			coins[i] = inp.nextInt();
		}
		System.out.println(getMinimumCoin(n,amount,coins));
		inp.close();
	}

	private static int getMinimumCoin(int n, int amount, int[] coins) {
		int minCoin[] = new int[amount+1];
		
		int cc[] = new int[n+1];
		minCoin[0] = 0;
		for(int amt=1;amt<=amount;amt++) {
			minCoin[amt] = -1;
			for(int i=0;i<=n;i++) {
				cc[i] = amt;
			}
			
			for(int i=1;i<=n;i++) {
				if(coins[i]<=amt) {
					cc[i] = Math.min(cc[i], minCoin[amt-coins[i]]+1);
				}
			}
			
			for(int i=1;i<=n;i++){
				if(minCoin[amt] == -1) 
					minCoin[amt] = cc[i];
				else 
					minCoin[amt] = Math.min(minCoin[amt], cc[i]);
			}
		}
		return minCoin[amount];
	}

}
