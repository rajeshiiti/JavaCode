package com.code.codeforces.con367;

import java.util.Scanner;

public class QA {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double vaislyX,vaislyY;
		vaislyX=inp.nextDouble();
		vaislyY=inp.nextDouble();
		final int n = inp.nextInt();
		double[][] taxisSLoc = new double[n][3];
		for(int i=0;i<n;i++) {
			taxisSLoc[i][0]=inp.nextDouble();
			taxisSLoc[i][1]=inp.nextDouble();
			taxisSLoc[i][2]=inp.nextDouble();
		}
		double minTime = 9999999;
		for(int i=0;i<n;i++) {
			minTime = Math.min(minTime, (getDistanceBtwTwoPoints(vaislyX, vaislyY, taxisSLoc[i][0], taxisSLoc[i][1]))/ taxisSLoc[i][2]);
		}
		System.out.println(minTime);
	}
	public static double getDistanceBtwTwoPoints(double x1,double y1,double x2,double y2) {
		return Math.hypot(x1-x2,y1-y2);
		
	}

}
