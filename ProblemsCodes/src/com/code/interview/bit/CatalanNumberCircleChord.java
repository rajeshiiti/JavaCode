package com.code.interview.bit;

public class CatalanNumberCircleChord {
	public static void main(String[] args) {
		System.out.println(chordCnt(74));
	}
	public static long mod = 1000000007;
	public static int chordCnt(int A) {
		
		return (int) chords(A);
    }
	public static int chords(int n)
    {
            if(n == 0) return 1;
            long[] table = new long[n + 1];
            table[0] = 1;
            table[1] = 1;
            for(int i = 2; i <= n; i++) {
                    for(int j = 0; j < i; j++) {
                            table[i] += table[j] * table[i - 1 - j];
                            table[i] %= mod;
                    }
            }
            return (int) table[n];
    }

}
