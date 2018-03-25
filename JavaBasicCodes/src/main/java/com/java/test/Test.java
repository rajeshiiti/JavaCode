package com.java.test;



public class Test {

	public static void main(String[] args) {
		String firstName = "ims";
		String lastName = "imslast";
		String middleName = "immiddlef";
		
		String name = "";
		name = getName(firstName);
		if (middleName!=null && !middleName.isEmpty()) {
			name = name + " ";
			name = name + getName(middleName);
		}
		if (lastName!=null && !lastName.isEmpty())
			name = name + " ";
			name =name + getName(lastName);
		System.out.println(name);
		String[] string = name.split(" ");
		System.out.println(string.length+" "+ string.toString());
		for(String str: string) {
			String[] string1 = str.split("#");
			System.out.println(string1.length+" "+ string1.toString());
			for(String str1: string1) {
				System.out.println(str1);
			}
		}
		

	}

	private static String getName(String firstName) {
		String[] string = firstName.split(" ");
		System.out.println(string.length);
		String tempName = "";
		for(String str:string) {
			if(str!=null && !str.isEmpty()) {
				if(tempName != null && !tempName.isEmpty()) {
					tempName=tempName+"#";
				}
				tempName=tempName+str;
			}
		}
		
		return tempName;
	}
	
	

}
