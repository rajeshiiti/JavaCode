package com.code.codeforces.con392;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuesA {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			list.add(inp.nextInt());
		}
		int max = getMax(list);
		int ans = 0;
		for(Integer in:list) {
			ans = ans + (max - in);
		}
		System.out.println(ans);
		inp.close();
		
	}

	private static int getMax(List<Integer> list) {
		int max = list.get(0);
		for(Integer in : list) {
			max = Math.max(max, in);
		}
		return max;
	}

}
