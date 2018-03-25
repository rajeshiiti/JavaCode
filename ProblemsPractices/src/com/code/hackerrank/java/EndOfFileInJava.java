package com.code.hackerrank.java;

import java.util.Scanner;

public class EndOfFileInJava {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String tmp = inp.nextLine();
		int index=1;
		while(tmp!=null && !tmp.isEmpty()) {
			System.out.println(index+" "+tmp);
			tmp=inp.nextLine();
			index++;
		}
		inp.close();
	}

}
