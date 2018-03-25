package com.code.codeforces.con378;

import java.util.Scanner;

public class QA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		inp.close();
		System.out.println(getMinJump(str));
		
	}

	public static int getMinJump(String str) {
		int ans=1,tmp=1;
		for(int i = 0 ;i < str.length(); i ++) {
			if(  str.charAt(i) == 'A' || str.charAt(i) == 'E'
				|| str.charAt(i) == 'I' || str.charAt(i) == 'O'
				|| str.charAt(i) == 'U' || str.charAt(i) == 'Y') {
				ans = Math.max(ans, tmp);
				tmp =1;
			} else {
				tmp++;
			}
		}
		ans = Math.max(ans, tmp);
		return ans;
	}

}
