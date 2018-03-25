package com.java.statickeyWord;

public class StaticVariableMain {
	public static void main(String[] args) {
		StaticVariable staticVariable  = new StaticVariable();
		staticVariable.tmp = 100;
		System.out.println(staticVariable.tmp);
		
		StaticVariable staticVariable1  = new StaticVariable();
		staticVariable1.tmp = 1000;
		System.out.println(staticVariable1.tmp);
		
		System.out.println(staticVariable.tmp);
		
	}

}
