package com.code.codeforces.con391;

import java.util.Scanner;

public class QuesA {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		int capB = 0;
		int smaB = 0;
		int smaU = 0;
		int smaA = 0;
		int smaL = 0;
		int smaS = 0;
		int smaR = 0;
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)== 66)
				capB++;
			if((int)str.charAt(i)== 98)
				smaB++;
			if((int)str.charAt(i)== 97)
				smaA++;
			if((int)str.charAt(i)== 115)
				smaS++;
			if((int)str.charAt(i)== 114)
				smaR++;
			if((int)str.charAt(i)== 108)
				smaL++;
			if((int)str.charAt(i)== 117)
				smaU++;
		}
		int max = 0;
		System.out.println(Math.max(max, Math.min(smaB, Math.min(smaA/2, Math.min(smaS, Math.min(smaR, Math.min(smaL, Math.min(smaU/2, capB))))))));
		inp.close();
	}

}
