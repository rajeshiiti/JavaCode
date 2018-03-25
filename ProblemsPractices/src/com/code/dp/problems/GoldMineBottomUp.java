package com.code.dp.problems;

public class GoldMineBottomUp {
	static int size = 4;
	static int[][] gold = { { 1, 3, 1, 5 }, 
        { 2, 2, 4, 1 }, 
        { 5, 0, 2, 3 },
        { 0, 6, 1, 2 } };
	static int[][] goldDP = {{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1},{-1,-1,-1,-1}};
	public static void main(String[] args) {
		for(int i=0;i<size;i++)
			goldDP[i][size-1] = gold[i][size-1];
		for(int j=size-1;j>=1;j--){
			for(int i=0;i<size;i++)  {
				int max = -1;
				if(i>0) 
					max = Math.max(max, goldDP[i-1][j]);
				if(i<size-1)
					max = Math.max(max, goldDP[i+1][j]);
				max = Math.max(max, goldDP[i][j]);
				goldDP[i][j-1] = max + gold[i][j-1];
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(gold[i][j]+" ");
			}
		System.out.println();
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(goldDP[i][j]+" ");
			}
		System.out.println();
		}
	}

}
