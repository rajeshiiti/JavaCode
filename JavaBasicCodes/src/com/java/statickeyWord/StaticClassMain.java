package com.java.statickeyWord;

public class StaticClassMain {
	public static void main(String[] args) {
		StaticClass.StaticInnerClass.c =12;
		System.out.println(StaticClass.StaticInnerClass.c);
	}

}
