package com.code.codeforces.con391;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuesB {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			list.add(inp.nextInt());
		}
		int rootFactorization[] = new int[100001];
		for(int i=0;i<=100000;i++) 
			rootFactorization[i] =0;
		for(Integer inte:list) {
			int tmp = inte;
			int root = (int) Math.sqrt(tmp);
			for(int i=2; i<=root;i++) {
				if(tmp%i==0)
					rootFactorization[i] ++;
				while(tmp%i==0)
					tmp = tmp/i;
			}
			if(tmp>0)
				rootFactorization[tmp]++;
		}
		int max=1;
		for(int i=2;i<=100000;i++)
			max = Math.max(rootFactorization[i], max);
		System.out.println(max);
		inp.close();
	}
}
