package com.code.interview.bit;

public class ExcelWordColumn {
	public static void main(String[] args) {
		System.out.println(titleToNumber("AAB"));
	}
	public static int titleToNumber(String a) {
		 int len = a.length();
			int ans = 0;
			int j = 1;
			while(j<len) {
				ans = (int) (ans + Math.pow(26, j));
				j++;
			}
			j = 0;
			for(int i=len-1;i>=0;i--) {
				if(i==len-1) {
					ans = (int) (ans + ((int)a.charAt(i)-64));
				} else {
					ans = (int) (ans + ((int)a.charAt(i)-65)*Math.pow(26, j));
				}
				j++;
			}
			return ans;
	}
	

}
