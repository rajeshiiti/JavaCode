package com.code.codeforces.con392;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QuesB {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("R", 0);
		map.put("B", 0);
		map.put("Y", 0);
		map.put("G", 0);
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		int[] array = new int[5];
		array[0] = 0;
		array[1] = 0;
		array[2] = 0;
		array[3] = 0;
		array[4] = 0; 
		
		for(int i=0;i<str.length();){
			if(i<str.length() && (int)str.charAt(i)==33)
				array[0] = array[0] +1;
			else if(i<str.length())
				map.put(str.substring(i, i+1), (i)%4);
			if(i+1<str.length() && (int)str.charAt(i+1)==33)
				array[1] = array[1] +1;
			else if(i+1<str.length()) 
				map.put(str.substring(i+1, i+2), (i+1)%4);
			if(i+2<str.length() && (int)str.charAt(i+2)==33)
				array[2] = array[2] +1;
			else if(i+2<str.length()) 
				map.put(str.substring(i+2, i+3), (i+2)%4);
			if(i+3<str.length() && (int)str.charAt(i+3)==33)
				array[3] = array[3] +1;
			else if(i+3<str.length()) 
				map.put(str.substring(i+3, i+4), (i+3)%4);
			i = i+4;
		}
		
		System.out.println(array[map.get("R")]+" "+array[map.get("B")]+" "+array[map.get("Y")]+" "+array[map.get("G")]);
		
		inp.close();
	}

}
