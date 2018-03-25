package com.code.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class TwoSum {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int target = inp.nextInt();
		int nums[] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = inp.nextInt();
		}
		int[] ans = twoSum(nums,target);
		System.out.print(ans[0]+" "+ans[1]);

	}
	
	public static int[] twoSum(int[] nums, int target) {
		int size = nums.length;
		int l = 0;
		int r = size-1;
		int ans[] = new int[2];
		while(l<r) {
			if(nums[l]+nums[r] == target) {
				ans[0] = l;
				ans[1] = r;
				return ans;
			} else if(nums[l]+nums[r] < target) {
				l++;
			} else {
				r--;
			}
		}
		return nums; 
		
	}

}
