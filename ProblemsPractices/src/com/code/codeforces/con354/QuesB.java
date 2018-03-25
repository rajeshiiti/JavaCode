package com.code.codeforces.con354;

import java.util.Scanner;

public class QuesB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height= input.nextInt();
		int time= input.nextInt();
		input.close();
		int totalGlass = (height*(height+1) )/2;
		double glass[] = new double[totalGlass+1];
		for(int i=1;i<=totalGlass;i++) {
			glass[i]=0;
		}
		glass[1]=time;
		int count=1;
		for(int i=1;i<height;i++) {
			for(int j=1;j<=i;j++) {
				if(glass[count]>=1) {
					double rest= glass[count]-1;
					glass[count]=1;
					glass[count+i]+=rest/2;
					glass[count+i+1]+=rest/2;
				}	
				count++;
			}
		}
		int ans=0;
		for(int i =1;i<=totalGlass;i++){
			//System.out.println(glass[i]);
			if(glass[i] >= 1.0) ans++;
		}
		System.out.println(ans);
	}

}