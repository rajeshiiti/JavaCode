package com.java.mainClass;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaMainClassRegex {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String str = "test";
	    if (Pattern.compile("[0-9]").matcher(str).find()) {
	       System.out.println(str);
	    } else {
	    	System.out.println("No pattern find");
	    }
		
		inp.close();
		
	}

}
