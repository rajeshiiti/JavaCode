package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxContinuousSeriesOf1s {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a.add(inp.nextInt());
		}
		int m =inp.nextInt();
		ArrayList<Integer> ans = maxone(a, m);
		for(Integer inte:ans) {
			System.out.print(inte+" ");
		}
		inp.close();
	}
	public static ArrayList<Integer> maxone(ArrayList<Integer> a, int b) {
		List<Integer> zeroIndex = new ArrayList<Integer>();
		for(int i=0;i<a.size();i++) {
			if(a.get(i) == 0) {
				zeroIndex.add(i);
			}
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(zeroIndex.size()<=b){
			for(int i=0;i<a.size();i++) {
				ans.add(i);
			}
		} else {
			int j = 0;
			int start = 0;
			int end = 0;
			int ansLen = 0;
			int indexI = 0,IndexJ = 0;
			for(int i=b-1;i<zeroIndex.size();) {
				if(j==0) {
					start = 0;
				} else {
					start = zeroIndex.get(j-1)+1;
				}
				if(i==zeroIndex.size()-1) {
					end = a.size()-1;
					
				} else {
					end = zeroIndex.get(i+1)-1;
				}
				if(end-start+1>ansLen) {
					indexI = start;
					IndexJ = end;
					ansLen = end-start+1;
				}
				j++;
				i++;
			}
			for(int k=indexI;k<=IndexJ;k++) {
				ans.add(k);
			}
		}
		return ans;
	}

}
