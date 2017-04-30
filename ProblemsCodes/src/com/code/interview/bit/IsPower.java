package com.code.interview.bit;

public class IsPower {
	public static void main(String[] args) {
		System.out.println(isPower(81));
	}
	public static boolean isPower(int a) {
		if(a==1) return true;
		if(a<=3) return false;
		int n = (int) Math.sqrt(a);
		int[] power= new int[n+1];
		for(int i=0;i<=n;i++) {
			power[i] = 1;
		}
		for(int i=2;i<=n;i++) {
			if(power[i]==1) {
				long tmp = (long) Math.pow(i, 2);
				int cnt =3;
				while( tmp<=a) {
					if(tmp==a)
						return true;
					if(tmp<=n) {
						power[(int) tmp] = 0;
					}
					tmp = (long) Math.pow(i, cnt++);
				}
			}
		}
		return false;
    }

}
