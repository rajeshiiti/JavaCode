package com.code.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RotateArray {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ts = br.readLine().split(" ");
		int t = Integer.parseInt(ts[0]);
		while(t>0) {
			String[] ns = br.readLine().split(" ");
			int n = Integer.parseInt(ns[0]);
			int k = Integer.parseInt(ns[1]);
			String[] as = br.readLine().split(" ");
			if(k>n)
				k = k%n;
			String ans="";
			for(int i=n-k;i<n;i++)
				ans =ans + Integer.parseInt(as[i])+" ";
			for(int i=0;i<n-k;i++)
				ans =ans + Integer.parseInt(as[i])+" ";
			System.out.println(ans);
			
			t--;
		}
	}

}
