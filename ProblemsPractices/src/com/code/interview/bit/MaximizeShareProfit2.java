package com.code.interview.bit;

import java.util.List;

public class MaximizeShareProfit2 {
	public int maxProfit(final List<Integer> a) {
		int profit = 0;
		for(int i=1;i<a.size();i++) {
			int diff = a.get(i)-a.get(i-1);
			if(diff>0) {
				profit +=diff;
			}
		}
		return profit;
	}

}
