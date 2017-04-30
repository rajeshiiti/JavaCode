package com.code.hackerearth;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class UniqueSubarrays {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int n = inp.nextInt();
			long[] A = new long[n+1];
			for(int i=1;i<=n;i++) {
				A[i] = inp.nextInt();
			}
			Map<Long,Integer> map = new HashMap<Long,Integer>();
			List<Long> list = new ArrayList<Long>();
			long size =0;
			for(int i=1;i<=n;i++) {
				if(map.containsKey(A[i])) {
					long value = map.get(A[i]);
					map.put(A[i], i);
					list.add(size);
					size = i-value;
				} else {
					size++;
					map.put(A[i],i);
				}
			}
			list.add(size);
			Long ans = 0L;
			for(Long in:list) {
				ans = ans + (in*(in+1)*(in+2))/6;
				System.out.println(ans);
			}
			System.out.println(ans);
			
			t--;
		}
		inp.close();
	}

}

