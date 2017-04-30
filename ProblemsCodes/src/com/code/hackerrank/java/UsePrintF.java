package com.code.hackerrank.java;

import java.util.Scanner;

public class UsePrintF {
	 public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
         System.out.println("================================");
		for(int i=0;i<3;i++) {
			String s = inp.nextLine();
			//System.out.println(s);
			//int a = inp.nextInt();
			int tmp1=15-s.indexOf(" ");
			String tmp = "";
			while(tmp1>0){
				tmp=tmp+" ";
				tmp1--;
			}
			if(s.length()-s.indexOf(" ")==2) {
				tmp=tmp+"00";
			} else if(s.length()-s.indexOf(" ")==3) {
				tmp=tmp+"0";
			}
			
			
			System.out.println(s.replaceFirst(" ", tmp));
		}
		inp.close();
         System.out.println("================================");

 }
	

}
