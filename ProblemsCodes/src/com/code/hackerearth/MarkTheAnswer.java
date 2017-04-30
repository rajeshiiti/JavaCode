package com.code.hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class MarkTheAnswer {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ns = br.readLine().split(" ");
		int n = Integer.parseInt(ns[0]);
		int x = Integer.parseInt(ns[1]);
		String[] as = br.readLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();
		int cnt =0;
		for(int i=0;i<n;i++) {
			if(Integer.parseInt(as[i])>x) {
				list.add(cnt);
				cnt =0;
			}
			else cnt++;
		}
		list.add(cnt);
		int prev = 0,max =0;
		int tmp =0;
		for(Integer in:list) {
			max = Math.max(max, prev+in);
			prev = in;
			tmp++;
			if(tmp==2)
				break;
		}
		System.out.println(max);
	}

}
