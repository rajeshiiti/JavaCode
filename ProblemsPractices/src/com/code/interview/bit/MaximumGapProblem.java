package com.code.interview.bit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumGapProblem {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			array.add(inp.nextInt());
		}
		System.out.println(maximumGap(array));
		inp.close();
	}
	public static int maximumGap(final List<Integer> a) {
		int n = a.size();
		if(n<2)
			return 0;
		int min= a.get(0);
		int max= a.get(0);
		for(int i=1;i<n;i++) {
			min = Math.min(min, a.get(i));
			max = Math.max(max, a.get(i));
		}
		double interval = (double)n/(max-min);
		Bucket[] buckets = new Bucket[n+1];
		for(int i=0;i<=n;i++) {
			buckets[i] = new Bucket();
		}
		for(int i=0;i<n;i++) {
			int index = (int) (interval*(a.get(i)-min));
			if(buckets[index].low==-1) {
				buckets[index].low = a.get(i);
				buckets[index].high = a.get(i);
			} else {
				buckets[index].low = Math.min(a.get(i), buckets[index].low);
				buckets[index].high = Math.max(a.get(i), buckets[index].high);
			}
		}
		int ans = buckets[0].high-buckets[0].low;
		int prev = buckets[0].high;
		for(int i=1;i<=n;i++) {
			if(buckets[i].low != -1) {
				ans = Math.max(ans, buckets[i].low-prev);
				prev = buckets[i].high;
			}
		}
		return ans;
	}

}
class Bucket {
	int low;
	int high;
	public Bucket() {
		low = -1;
		high = -1;
	}
}
