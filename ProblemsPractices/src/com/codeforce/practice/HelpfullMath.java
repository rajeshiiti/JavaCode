package com.codeforce.practice;

import java.util.Scanner;

public class HelpfullMath {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s=inp.nextLine();
		int one=0,two=0,three=0;
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1') {
				one++;
			} else if(s.charAt(i)=='2') {
				two++;
			} else if(s.charAt(i)=='3') {
				three++;
			}
		}
		boolean tmp =false;
		while(one>0) {
			tmp=true;
			ans=ans+"1";
			one--;
			if(one>0)
				ans=ans+"+";
			else break;
		}
		if(two>0 && tmp) {
			ans=ans+"+";
		} else if(two==0 && three>0 && tmp) {
			ans=ans+"+";
		}
		tmp=false;
		while(two>0) {
			tmp=true;
			ans=ans+"2";
			two--;
			if(two>0)
				ans=ans+"+";
			else break;
		}
		if(three>0 && tmp) {
			ans=ans+"+";
		}
		tmp=false;
		while(three>0) {
			ans=ans+"3";
			three--;
			if(three>0)
				ans=ans+"+";
			else break;
		}
		System.out.println(ans);
		
	}
}
