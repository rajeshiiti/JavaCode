package com.code.dp.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherPuzzle {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int m = inp.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<=m;i++) {
			list.add(inp.nextInt());
		}
		Collections.sort(list);
		int startIndex = 0;
		int minDiff = 999999999; 
		for(int i=n-1;i<m;i++) {
			if(list.get(i)-list.get(startIndex)< minDiff) {
				minDiff = list.get(i)-list.get(startIndex);
			}
			startIndex++;
		}
		System.out.println(minDiff);
		inp.close();

	}

}
