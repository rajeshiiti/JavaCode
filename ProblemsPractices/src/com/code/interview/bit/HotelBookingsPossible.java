package com.code.interview.bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HotelBookingsPossible {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		ArrayList<Integer> arrive = new ArrayList<Integer>();
		ArrayList<Integer> depart = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arrive.add(inp.nextInt());
			depart.add(inp.nextInt());
		}
		int k = inp.nextInt();
		System.out.println(hotel(arrive, depart, k));
		inp.close();
	}
	public static  boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		Collections.sort(arrive);
		Collections.sort(depart);
		int n = arrive.size();
		int a = 0; 
		int d = 0;
		int cnt = 0;
		int dCnt = 0;
		while(a<n && d<n) {
			int tmp = 0;
			while(a<n && arrive.get(a)<depart.get(d)) {
				a++;
				cnt++;
				tmp++;
			}
			if(tmp>0) {
				cnt = cnt -dCnt;
				dCnt = 0;
			}
			if(cnt> K){
				return false;
			}
			d++;
			dCnt++;
		}
		return true;
        
    }

}