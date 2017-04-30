package com.code.interview.bit;

public class SayAndHello {
	public static void main(String[] args) {
		
	}
	public static String countAndSay(int a) {
		String str1 = "1";
		String str2 = "11";
		if(a==1) {
			return str1;
		} else if(a==2) {
			return str2;
		}
		char[] chars1 = new char[1000001];
		char[] chars2 = new char[1000001];
		chars1[0] = '1';
		chars1[1] = '1';
		int cnt1 = 2;
		int cnt2 = 0;
		a = a -2;
		boolean bln= true;
		while(a>0) {
			if(bln) {
				int i = 0;
				cnt2 = 0;
				while(i<cnt1) {
					int j = i+1;
					int tmp = 1;
					while(j<cnt1 && chars1[j]==chars1[j-1]) {
						tmp++;
					}
					
				}
				cnt1 = 0;
			} else{
				
			}
		}
		return null;
	}

}
