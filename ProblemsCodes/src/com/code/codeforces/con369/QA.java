package com.code.codeforces.con369;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QA {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int n=inp.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i=0;i<=n;) {
			String str =null;
			str=inp.nextLine();
			list.add(str);
			i++;
		}
		solve(list);
	}

	public static void solve(List<String> list) {
		for(String str: list) {
			if(str!=null && str.contains("OO")) {
				list.set(list.indexOf(str), str.replaceFirst("OO", "++"));
				System.out.println("YES");
				print(list);
				return;
				
			}
		}
		System.out.println("NO");
		//print(list);
	}

	private static void print(List<String> list) {
		for(String str:list) {
			if(!str.isEmpty())
				System.out.println(str);
		}
		
	}
}
