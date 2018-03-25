package com.code.leetcode;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArrayII {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = inp.nextInt();
		}
		int len = removeDuplicates(nums);
		for(int i=0;i<len;i++) {
			System.out.print(nums[i]+" ");
		}
		inp.close();
	}
	public static int removeDuplicates(int[] nums) {
		int len = nums.length;
		int j=1;
        if(len<=2) {
            return len;
        }
       int tmp = 1;
       for(int i=1;i<nums.length;i++) {
       	if(nums[i]==nums[i-1]) {
       		tmp++;
       	} else {
       		tmp =1;
       	}
       	if(tmp>2) {
       		len--; 
       	} else {
       		nums[j] =nums[i];
       		j++;
       	}
       }
       return len;
    
    }

}
