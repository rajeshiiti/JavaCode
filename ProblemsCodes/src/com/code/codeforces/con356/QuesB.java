package com.code.codeforces.con356;

import java.util.Scanner;

public class QuesB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int inpArray[] = new int[101];
		for(int i=0;i<=100;i++) {
			inpArray[i]=0;
		}
		int n=inp.nextInt();
		int a=inp.nextInt();
		for(int i=1;i<=n;i++) {
			inpArray[i]= inp.nextInt();
		}
		System.out.println(maxCriminal(n,a,inpArray));
	}
	
	public static int maxCriminal(int n,int a,int inpArray[]) {
		int start=a-1,end=a+1,ans=0;
		if(inpArray[a]==1) {
			 ans++;
		 }
		while(start>=1 && end <=n) {
			 if(inpArray[start] ==1 && inpArray[end] ==1) {
				 ans=ans+2;
			 }
			 start--;
			 end++;
		}
		while(start>=1) {
			 if(inpArray[start] ==1) {
				 ans++;
			 }
			 start--;
		}
		while(end <=n) {
			 if(inpArray[end] ==1) {
				 ans++;
			 }
			 end++;
		}
		return ans;
	}
}
