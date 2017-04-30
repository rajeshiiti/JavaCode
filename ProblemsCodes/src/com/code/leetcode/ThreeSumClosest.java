package com.code.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreeSumClosest {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int target = inp.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = inp.nextInt();
		}
		System.out.println(threeSumClosest(nums, target));
		inp.close();
		
	}
	public static int threeSumClosest(int[] nums, int target) {
		int ans = Integer.MAX_VALUE;
		int sum = Integer.MAX_VALUE;
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
				if(nums[i]+nums[l]+nums[r] == target) {
					return nums[i]+nums[l]+nums[r];
				} else if(nums[i]+nums[l]+nums[r]<target) {
					if(ans>Math.abs(target-(nums[i]+nums[l]+nums[r]))) {
						ans = Math.min(ans, Math.abs(target-(nums[i]+nums[l]+nums[r])));
						sum = nums[i]+nums[l]+nums[r];
					}
					l++;
				} else {
					if(ans>Math.abs((nums[i]+nums[l]+nums[r])-target)) {
						ans = Math.min(ans, Math.abs((nums[i]+nums[l]+nums[r])-target));
						sum =  nums[i]+nums[l]+nums[r];
					}
					r--;
				}
			}
		}
		
        return sum;
    }

}
