package com.code.dp.problems;

import java.util.Scanner;

public class CountSubArray {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while (t > 0) {
			long n = inp.nextLong();
			long prev = 1;
			long total = 1;
			long firstOne = inp.nextLong();
			for (int i = 1; i < n; i++) {
				long tmp = inp.nextLong();
				long currentPossible = 1;
				if (tmp >= firstOne) {
					currentPossible = currentPossible + prev;
					prev = currentPossible;
				}
				firstOne = tmp;
				prev = currentPossible;
				total = total + currentPossible;
			}
			System.out.println(total);
			t--;
		}
		inp.close();

	}
}
