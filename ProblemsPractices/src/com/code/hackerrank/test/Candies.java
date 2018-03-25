package com.code.hackerrank.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Candies {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n= inp.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			int a=inp.nextInt();
			list.add(a);
		}
		System.out.println(getMinCandies(n,list));
	}

	private static int getMinCandies(int n, List<Integer> list) {
		long ans=0;
		int[] aray = new int[100001];
		aray[1]=0;
		for(int i=1;i<n;i++) {
			if(list.get(i)-list.get(i-1)>0) {
				aray[i+1]=1;
			} else if(list.get(i)-list.get(i-1)<0){
				aray[i+1]=-1;
			} else {
				aray[i+1]=0;
			}
		}
		long temp=1;
		for(int i=1;i<=n;i++) {
			
		}
		return 0;
	}
}
