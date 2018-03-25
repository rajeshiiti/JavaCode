package com.java.regex;

import java.util.regex.Pattern;

public class JavaPatternClass {
	public static void main(String[] args) {
		String text = "This is text";
		String pattern ="is";
		boolean matches = Pattern.matches(pattern, text);
	}

}
