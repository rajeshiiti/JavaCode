package com.code.dp.problems;
public class GoldMineTopDown {

	static int[][] gold = { { 1, 3, 1, 5 }, 
        { 2, 2, 4, 1 }, 
        { 5, 0, 2, 3 },
        { 0, 6, 1, 2 } };
	static int[][] goldDP = {{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1}};
	public static void main(String[] args) {
		
		int goldHiGold = getMaxGold(4);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(gold[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println(goldHiGold);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(goldDP[i][j]+" ");
			}
		System.out.println();
		}
	}

	private static int getMaxGold(int n) {
		int max = -1;
		for(int i=0;i<n;i++) {
			max = Math.max(max, maxGold(n,i,0));
		}
		return max;
	}

	private static int maxGold(int n,int i, int j) {
		if(i<0 || j>=n || i>=n)
			return 0;
		if(goldDP[i][j]==-1)  {
			goldDP[i][j] = gold[i][j];
			goldDP[i][j] =goldDP[i][j]+ Math.max(maxGold(n, i-1, j+1), 
					Math.max(maxGold(n, i, j+1), maxGold(n, i+1, j+1)));
		}
		return goldDP[i][j];
	}
}