package com.code.interview.bit;
import java.util.ArrayList;
import java.util.Scanner;
public class RotateArrayWith90Degree {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		for(int j=0;j<n;j++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				list.add(inp.nextInt());
			}
			a.add(list);
		}
		rotate(a);
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list = a.get(i);
			for(int j=0;j<n;j++) {
					System.out.print(list.get(j)+" ");
			}
			System.out.println();
		}
		inp.close();
	}
	
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		int size = a.get(0).size();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<size;i++) {
			for(int j=size-1;j>=0;j--) {
				sb.append(a.get(j).get(i).toString());
				if(j>0) {
					sb.append(" ");
				}
			}
			if(i<size-1) {
				sb.append("#");
			}
		}
		String[] str = sb.toString().trim().split("#");
		for(int i=0;i<size;i++) {
			String[] tmp = str[i].split(" ");
			for(int j=0;j<size;j++) {
				a.get(i).set(j, Integer.parseInt(tmp[j]) );
			}
		}
	}

}
