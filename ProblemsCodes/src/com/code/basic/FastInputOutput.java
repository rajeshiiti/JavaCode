package com.code.basic;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class FastInputOutput {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		String A[] = br.readLine().split(" ");
		String B[] = br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			System.out.printf( Integer.toString((Integer.parseInt(A[i])+Integer.parseInt(B[i])))+" ");
		}
		
	}

}
