package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;

public class BalancedBrackets {
	static char char1='{';
	static char char2='}';
	static char char3='(';
	static char char4=')';
	static char char5='[';
	static char char6=']';
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.nextLine();
		for(int i=1;i<=n;i++) {
			String str = inp.nextLine();
			boolean bln = getStringBalanceStatus(str);
			if(bln) 
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
		inp.close();
		
	}

	private static boolean getStringBalanceStatus(String str) {
		int tmp = str.length();
		int tmp1=tmp;
		if(tmp%2==1)
			return false;
		else {
			for(int i=1;i<= tmp/2 ; i++) {
				if( (str.charAt(i-1) ==char1 && str.charAt(tmp1-i)!=char2)  ||
					 (str.charAt(i-1) ==char3 && str.charAt(tmp1-i)!=char4) || 
					 (str.charAt(i-1) ==char5 && str.charAt(tmp1-i)!=char6)) {
					return false;
				}
			}
		}
		return true;
	}

}
