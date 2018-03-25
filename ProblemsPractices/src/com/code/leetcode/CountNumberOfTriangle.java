package com.code.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
 * Triangle properties are
 * a,b,c are edges 
 * a+b>c
 * a+c>b
 * b+c>a
 */
public class CountNumberOfTriangle {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = inp.nextInt();
		}
		List<List<Integer>> lists = getTriangle(nums);
		for(List<Integer> list : lists) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println("\n");
		}
		inp.close();
	}
	public static List<List<Integer>> getTriangle(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> num = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			num.add(nums[i]);
		}
		Collections.sort(num);
		for(int i=0;i<num.size();i++) {
			nums[i] = num.get(i);
		}
		int n = nums.length;
		for(int i=0;i<n-2;i++) {
			int l = i+1;
			int r = n-1;
			while(l<r) {
				if(nums[i]+nums[l]>nums[r]) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(i);
					list.add(l);
					list.add(r);
					lists.add(list);
					l++;
				} else {
					r--;
				}
			}
		}
		return lists;
	}

}
