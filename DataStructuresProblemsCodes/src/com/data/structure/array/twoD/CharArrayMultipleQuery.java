package com.data.structure.array.twoD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CharArrayMultipleQuery {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int q = Integer.parseInt(strs[1]);
		String s = br.readLine();
		int[][] stringHash = new int[50001][26];
		String str = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i <= 50000; i++) {
			for (int j = 0; j < 26; j++) {
				stringHash[i][j] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 26; j++) {
				stringHash[i + 1][j] = stringHash[i][j];
			}
			int tmp = (int) s.charAt(i) - 97;
			stringHash[i + 1][tmp] = stringHash[i + 1][tmp] + 1;
		}
		StringBuilder sb = new StringBuilder();
		while (q > 0) {
			String[] strs1 = br.readLine().split(" ");
			int l = Integer.parseInt(strs1[0]);
			int r = Integer.parseInt(strs1[1]);
			int k = Integer.parseInt(strs1[2]);
			if (k > r - l + 1) {
				sb = sb.append("Out of range").append("\n");
			} else {
				for (int i = 0; i < 26; i++) {
					if (k <= (stringHash[r][i] - stringHash[l - 1][i])) {
						sb = sb.append(str.charAt(i)).append("\n");
						break;
					} else {
						k = k - (stringHash[r][i] - stringHash[l - 1][i]);
					}
				}

			}
			q--;
		}
		System.out.println(sb.toString());
	}
}