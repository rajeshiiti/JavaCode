package com.code.codeforces.con358;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuesB {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n=inp.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=n;i++) {
			int a=inp.nextInt();
			list.add(a);
		}
		
		System.out.println(getMex(list));
		
	}

	public static int getMex(List<Integer> list) {
		Collections.sort(list);
		int ans=1;
		for(Integer i:list) {
			if(i>=ans) ans++;
		}
		return ans;
	}

}
