package com.code.hackerearth;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ModifySequence {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ns = br.readLine().split(" ");
		int n = Integer.parseInt(ns[0]);
		String[] As = br.readLine().split(" ");
		int[] A = new int[n];
		for(int i=0;i<n;i++) {
			A[i] = Integer.parseInt(As[i]);
		}
		if(isUnable(A,n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	}

	private static boolean isUnable(int[] A, int n) {
		if(n==1 && A[0]>0)
			return false;
		if(n==1 && A[0]==0)
			return true;
		for(int i=0;i<n-1;i++) {
			if(A[i]>A[i+1])
				return false;
			A[i+1] = A[i+1] - A[i];
			A[i] = 0;
		}
		for(int i=0;i<n;i++) {
			if(A[i]!=0)
				return false;
		}
		return true;
	}

}
