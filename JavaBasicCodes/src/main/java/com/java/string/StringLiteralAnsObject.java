package com.java.string;

public class StringLiteralAnsObject {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if(str1 == str2) {
			System.out.println("yes...");
		}
		System.out.println(str1.hashCode()+" "+str2.hashCode());
		
		String str3 = new String("abcd").intern();
		//str3.intern();
		String str4 = "abcd";
		String str5 = "abcd";
		if(str3 == str5) {
			System.out.println("yes");
		}
		System.out.println(str3.hashCode()+" "+str4.hashCode());
		
		
	}

}
