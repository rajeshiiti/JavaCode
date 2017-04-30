package com.code.leetcode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ThreeSum {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = inp.nextInt();
		}
		List<List<Integer>> lists = threeSum(nums);
		for(List<Integer> list : lists) {
			for(Integer inte:list) {
				System.out.print(inte+" ");
			}
			System.out.println("\n");
		}
		inp.close();
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
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
		for(int i=0;i<n-2;) {
			int l = i+1;
			int r = n-1;
			while(l<r) {
				if(nums[i]+nums[l]+nums[r]==0) {
					List<Integer> list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[l]);
					list.add(nums[r]);
					lists.add(list);
					r--;
					l++;
					while(l<r && nums[r]==nums[r+1]) {
						r--;
					}
					while(l<r && nums[l]==nums[l-1]) {
						l--;
					}
				} else if(nums[i]+nums[l]+nums[r]<0) {
					l++;
				} else {
					r--;
				}
			}
			i++;
			while(i>0 && i<n-2 && nums[i]==nums[i-1]) {
				i++;
			}
		}
        return lists;
    }

}
