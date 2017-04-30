package com.code.interview.bit;

import java.util.List;

public class MaxmimizeStockPrice {
	public int maxProfit(final List<Integer> a) {
		if(a == null || a.size() == 0) {
			return 0;
		}
		int result = 0;
		int min = a.get(0);
		for(int i=1;i<a.size();i++) {
			result = Math.max(result, a.get(i)-min);
			min = Math.min(min, a.get(i));
		}
		return result;
		
	}

}
