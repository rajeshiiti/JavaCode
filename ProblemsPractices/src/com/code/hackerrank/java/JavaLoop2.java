package com.code.hackerrank.java;

import java.util.Scanner;

public class JavaLoop2 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int tr=inp.nextInt();
		while (tr>0) {
			int a = inp.nextInt();
			int b = inp.nextInt();
			int n = inp.nextInt();
			String tmp = "";
			long previos = a;
			for (int i = 0; i < n; i++) {
				long tmpLong = (long) (previos + (Math.pow(2, i)) * b);
				tmp = tmp + Long.toString(tmpLong);
				previos = tmpLong;
				tmp = tmp + " ";
			}
			System.out.println(tmp);
			tr--;
		}
		inp.close();

	}

}
