package com.code.algo.sort.comparable.comparator;

import java.util.ArrayList;
import java.util.List;

public class SortThreeArray {
	
	public static void main(String[] args) {
		int[] wages = new int[9];
		wages[1] = 7;
		wages[2] = 15;
		wages[3] = 3;
		wages[4] = 1;
		wages[5] = 5;
		wages[6] = 13;
		wages[7] = 11;
		wages[8] = 5;
		// Answer should be 
		// 4 3 5 8 1 7 6 2
		int[] indexArray = new int[9];
		indexArray[0] = 0;
		indexArray[1] = 1;
		indexArray[2] = 2;
		indexArray[3] = 3;
		indexArray[4] = 4;
		indexArray[5] = 5;
		indexArray[6] = 6;
		indexArray[7] = 7;
		indexArray[8] = 8;
		getsortedIndex(1,8,wages,indexArray);
		
		for(int i=1;i<=8;i++)
			System.out.println(indexArray[i]);
	}
	
	private static void getsortedIndex(int l, int h, int[] wages,
			int[] indexArray) {
		if(l<h){
			int m = (l+h)/2;
			getsortedIndex(l, m, wages, indexArray);
			getsortedIndex(m+1, h, wages, indexArray);
			merge(l,m,h,wages,indexArray);
		}
		
		
	}

	public static void merge(int l, int m, int h, int[] wages, int[] indexArray) {
		List<Integer> tmpList = new ArrayList<Integer>();
		int lt=l;
		int mt = m+1;

		while(lt<=m && mt<=h) {
			if(wages[indexArray[lt]]<=wages[indexArray[mt]]) {
				tmpList.add(indexArray[lt]);
				lt++;
			} else {
				tmpList.add(indexArray[mt]);
				mt++;
			}
		}
		
		while(lt<=m) {
			tmpList.add(indexArray[lt]);
			lt++;
		}
		while(mt<=h) {
			tmpList.add(indexArray[mt]);
			mt++;
		}
		
		lt = l;
		int i=0;
		while(lt<=h) {
			indexArray[lt] = tmpList.get(i);
			i++;
			lt++;
		}
	}
	
	

}
