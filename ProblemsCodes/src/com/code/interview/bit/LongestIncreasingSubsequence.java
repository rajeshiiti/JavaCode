package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(64);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(4);
		System.out.println(lis(a));
	}
	
	public static int lis(final List<Integer> a) {
		List<Integer> ans = new ArrayList<Integer>();
		if(a.size()==0) {
			return 0;
		}
		
		ans.add(a.get(0));
		for(int i=1;i<a.size();i++) {
			if(ans.get(ans.size()-1)<a.get(i)) {
				ans.add(a.get(i));
			}  else {
				int index = getIndex(0,ans.size()-1,ans,a.get(i));
				if(ans.get(index) != a.get(i)) {
					ans.set(index, a.get(i));
				}
			}
		}
		return ans.size();
	}

	private static int getIndex(int l, int r, List<Integer> ans, int val) {
		if(l>r) {
			return -1;
		}
		if(l==r) {
			return l;
		} else {
			int mid = (l+r) /2 ;
			if(ans.get(mid)>val) {
				return getIndex(l, mid, ans, val);
			} else {
				if(ans.get(mid)==val) {
					return mid;
				} else {
					if(mid+1<=r && ans.get(mid+1)>= val) {
						return mid+1;
					} else {
						return getIndex(mid+1, r, ans, val);
					}
				}
			}
		}
	}
	

}
