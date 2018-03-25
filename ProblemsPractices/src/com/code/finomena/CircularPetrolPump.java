package com.code.finomena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularPetrolPump {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t>0) {
			int n = inp.nextInt();
			int[] petrol = new int[n+1];
			int[] dist = new int[n+1];
			for(int i=1;i<=n;i++) {
				petrol[i] = inp.nextInt();
			}
			for(int i=1;i<=n;i++) {
				dist[i] = inp.nextInt();
			}
			List<Integer> ans = getAns(n,petrol,dist);
			
			t--;
		}
	}

	private static List<Integer> getAns(int n, int[] petrol, int[] dist) {
		List<Integer> list = new ArrayList<Integer>();
		int[] tmp = new int[n+1];
		int carry = 0;
		int ans[] = new int[n+1];
		for(int i=1;i<=n;i++) {
			tmp[i] = carry + petrol[i] -dist[i];
			ans[i] = petrol[i] -dist[i];
			carry = tmp[i];
		}
		// TODO Auto-generated method stub
		int maxPositive = Integer.MIN_VALUE;
		return null;
	}
	
}