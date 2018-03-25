package com.code.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndLuckyMinimum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ts = br.readLine().split(" ");
		int t = Integer.parseInt(ts[0]);
		while(t>0) {
			String[] ns = br.readLine().split(" ");
			int n = Integer.parseInt(ns[0]);
			int[] A = new int[n];
			String[] As = br.readLine().split(" ");
			int mini =1000000001;
			for(int i=0;i<n;i++) {
				A[i] = Integer.parseInt(As[i]);
				if(mini>A[i])
					mini = A[i];
			}
			int cnt=0;
			for(int i=0;i<n;i++) 
				if(A[i]==mini)
					cnt++;
			System.out.println(cnt);
			t--;
		}
	}

}
