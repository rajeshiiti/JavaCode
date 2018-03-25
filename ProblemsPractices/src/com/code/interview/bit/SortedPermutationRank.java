package com.code.interview.bit;

public class SortedPermutationRank {
	public static long mod = 1000003;
	public static void main(String[] args) {
		System.out.println(findRank("ZJKLMOP{}[]<>TRING"));
	}
	public static int findRank(String a) {
		int[] chars = new int[256];
		for(int i=0;i<256;i++) {
			chars[i] = 0;
		}
		for(int i=0;i<a.length();i++) {
			chars[(int)a.charAt(i)] = 1;
		}
		for(int i=1;i<256;i++) {
			chars[i] +=chars[i-1] ;
		}
		long ans = 0;
		for(int i = 0; i<a.length(); i++) {
			long tmp = ((chars[(int)a.charAt(i)]-1)*fact(a.length()-i-1))%mod;
			for(int j=(int)a.charAt(i);j<256;j++) {
				chars[j] = chars[j]-1;
			}
			ans  = (ans + tmp)%mod;
		}
		return (int) ans+1;
	}
	private static long fact(int n) {
		if(n<=1) 
			return 1;
		else return (n*fact(n-1))%mod;
	}

}
