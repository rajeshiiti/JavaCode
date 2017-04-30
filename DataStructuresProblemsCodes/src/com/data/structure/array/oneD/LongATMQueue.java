package com.data.structure.array.oneD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongATMQueue {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ns = br.readLine().split(" ");
		int n = Integer.parseInt(ns[0]);
		String[] As = br.readLine().split(" ");
		int[] A = new int[n];
		if(n == 1)
			System.out.println(1);
		for(int i=0;i<n;i++) {
			A[i] = Integer.parseInt(As[i]);
		}
		int cnt = 0;
		int tmp = A[0];
		for(int i=0;i<n;i++) {
			if(tmp>A[i]) {
				tmp = A[i];
				cnt++;
			}
		}
		cnt++;
		System.out.println(cnt);
	}

}
