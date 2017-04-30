package com.code.adobe;

public class SubStringProblem {
	public static void main(String[] args) {
		
	}
	public static void getPetrolData(int n, int[] petrolC, int[] dist) {
		int maxExtraPetrol = 0;
		for(int i=0;i<n;i++) {
			if(petrolC[i]<dist[i]) {
				maxExtraPetrol += (dist[i]-petrolC[i]);
			}
		}
		
	}

}
