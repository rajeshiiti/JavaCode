package com.code.dp.problems;

import java.util.Scanner;

public class RodCuttingTopDown {
	
	public static int tmp = 0;
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int len = inp.nextInt();
		int values[] = new int[21];
		for(int i=1;i<=len;i++) {
			values[i] = inp.nextInt();
		}
		values[0] = 0;
		System.out.println(profit(len,values));
		System.out.println(tmp);
		inp.close();
	}
	
	public static int profit(int len,int[] values) {
		if(len<=0)
			return 0;
		int max = -1;
		for(int i=1;i<=len;i++) {
			tmp++;
			max = Math.max(max, profit(len-i, values) + values[i]);
		}
		return max;
		
	}

}
