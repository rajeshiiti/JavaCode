package com.code.codeforces.con356;

import java.util.Scanner;

public class QuesA {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int inpArray[] = new int[101];
		for(int i=0;i<=100;i++) {
			inpArray[i]=0;
		}
		int totalSum=0;
		for(int i=0;i<5;i++) {
			int a = inp.nextInt();
			totalSum= totalSum+a;
			inpArray[a]++;
		}
		
		System.out.println(totalSum-minimumSum(inpArray));
	}
	
	public static int minimumSum(int inpArray[]) {
		int maxSum=0;
		for(int i=100;i>=0;i--) {
			if(inpArray[i]>1) {
				maxSum = Math.max(maxSum, i*Math.min(3, inpArray[i]));
			}
		}
		return maxSum;
	}

}
