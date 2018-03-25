package com.code.codechef.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ANUBTG {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int[] array = new int[1001];
			for(int i=0;i<=1000;i++) {
				array[i] = 0;
			}
			int n = inp.nextInt();
			for(int i=0;i<n;i++) {
				int tmp = inp.nextInt();
				array[tmp]++;
			}
			int ans = 0;
			List<Integer> list = new ArrayList<Integer>();
			for(int i=1;i<=1000;i++) {
				while(array[i]>0) {
					list.add(i);
					array[i]--;
				}
			}
			int tm = n-1;
			while(tm>=0) {
				if(tm>=1) {
					ans +=list.get(tm);
					tm--;
					ans +=list.get(tm);
					tm = tm-3;
				} else {
					ans +=list.get(tm);
					tm--;
				}
			}
			System.out.println(ans);
			t--;
		}
		inp.close();
		
	}

}
