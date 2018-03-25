package com.code.hackerrank.CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IceCreamParlerShop {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int m = inp.nextInt();
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=1;i<=n;i++) {
			int tmp = inp.nextInt();
			if(map.get(tmp)!=null) {
				map.put(tmp, map.get(tmp).intValue()+1);
			} else {
				map.put(tmp,1);
			}
			
		}
		inp.close();
	}

}
