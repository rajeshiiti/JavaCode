package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LeftRotation {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String inp1=inp.nextLine();
		
		StringTokenizer strToken = new StringTokenizer(inp1);
		int n = Integer.parseInt((String)strToken.nextElement());
		int rotation = Integer.parseInt((String)strToken.nextElement());
		int[] lst = new int[n+1];
		int getFinalRotation= rotation % n;
		String str = inp.nextLine();
		StringTokenizer strToken1 = new StringTokenizer(str);
		for(int i=1;i<=n;i++) {
			int tmp = Integer.parseInt((String)strToken1.nextElement());
			if(getFinalRotation==0) {
				System.out.println(tmp);
			} else {
				int index;
				if(i<=getFinalRotation) {
					index=n-getFinalRotation+i;
				} else {
					index=(i-getFinalRotation);
				}
				lst[index]=tmp;
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.print(lst[i]+" ");
		}
		inp.close();
	}

}
