package com.code.interview.bit;

import java.util.ArrayList;

public class GrayCode {
	
	public ArrayList<Integer> grayCode(int a) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int tmp = (int) Math.pow(2,a);
		ArrayList<Boolean> bl = new ArrayList<Boolean>();
		for(int i=0;i<tmp;i++) {
			bl.add(true);
		}
		ans.add(0);
		int prev = 0;
		for(int i=0;i<bl.size();i++) {
			prev = getNum(bl,prev);
			ans.add(prev);
		}
		return ans;
		
	}

	private int getNum(ArrayList<Boolean> bl, int prev) {
		for(int i=0;i<bl.size();i++) {
			if(bl.get(i) && isGray(i,prev)) {
				bl.set(i, false);
				return i;
			}
		}
		return 0;
	}

	private boolean isGray(int value, int prev) {
		int tmp = value ^ prev;
		while(tmp%2==0) {
			tmp /= 2;
		}
		if(tmp==1) {
			return true;
		}
		return false;
	}

}
