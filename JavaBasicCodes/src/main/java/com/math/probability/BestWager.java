package com.math.probability;

import java.util.Scanner;

public class BestWager {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] scores = new int[3];
		scores[0] = inp.nextInt();
		scores[1] = inp.nextInt();
		scores[2] = inp.nextInt();
		int wager1 = inp.nextInt();
		int wager2 = inp.nextInt();
		System.out.println(wager(scores, wager1, wager2));
		inp.close();
	}
	
	public static int wager (int[] scores, int wager1, int wager2)
	{
	 int best, bet, odds;
	 best = 0; bet = 0;

	 for (int wage = 0; wage<=scores[0]; wage++)
	 {
	  odds = 0;
	  //  in 'odds' we keep the number of favorable outcomes
	  for (int I = -1; I <= 1; I = I + 2)
	   for (int J = -1; J <= 1; J = J + 2)
	    for (int K = -1; K <= 1; K = K + 2)
	     if (scores[0] + I * wage > scores[1] + J * wager1  &&
	      scores[0] + I * wage > scores[2] + K * wager2)   { odds++; }
	  if (odds > best)  { bet = wage ; best = odds; }
	  //  a better wager has been found
	 }
	 return bet;
	}

}
