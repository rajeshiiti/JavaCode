package com.code.hackerrank.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaNumberFormatter {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double currency = inp.nextDouble();
		String usCurrency1 = (NumberFormat.getCurrencyInstance(new Locale("en","US"))).format(currency);
		System.out.println(usCurrency1.substring(1, usCurrency1.length()));
		System.out.println("US: "+ usCurrency1);
		System.out.println("India: Rs."+ usCurrency1.substring(1, usCurrency1.length()));
		System.out.println("China: "+(NumberFormat.getCurrencyInstance(new Locale("zh","CN"))).format(currency));
		System.out.println("France: "+(NumberFormat.getCurrencyInstance(new Locale("fr", "FR"))).format(currency));
		inp.close();
	}

}
