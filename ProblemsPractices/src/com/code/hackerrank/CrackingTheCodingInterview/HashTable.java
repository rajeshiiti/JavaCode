package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		inp.nextInt();
		inp.nextInt();
		inp.nextLine();
		String newsPaper = inp.nextLine();
		String note = inp.nextLine();
		String[] newsPaperArray = newsPaper.split(" ");
		String[] noteArray = note.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String str:newsPaperArray) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			} else {
				map.put(str,1);
			}
		}
		boolean status=true;
		for(String str:noteArray) {
			if(map.containsKey(str) && map.get(str)>0) {
				map.put(str, map.get(str)-1);
			} else {
				status=false;
				break;
			}
		}
		if(status) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		inp.close();
		

	}

}
