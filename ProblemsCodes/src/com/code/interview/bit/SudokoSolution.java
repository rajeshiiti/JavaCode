package com.code.interview.bit;

import java.util.ArrayList;

public class SudokoSolution {
	public static void main(String[] args) {
		ArrayList<ArrayList<Character>> a = getInput();
		
		solveSudoku(a);
		System.out.println(a.size());
		
	}

	private static ArrayList<ArrayList<Character>> getInput() {
		ArrayList<ArrayList<Character>> a = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> r1 = new ArrayList<Character>();
		r1.add('5');r1.add('3');r1.add('.');r1.add('.');r1.add('7');
		r1.add('.');r1.add('.');r1.add('.');r1.add('.');
		a.add(r1);
		ArrayList<Character> r2 = new ArrayList<Character>();
		r2.add('6');r2.add('.');r2.add('.');r2.add('1');r2.add('9');
		r2.add('5');r2.add('.');r2.add('.');r2.add('.');
		a.add(r2);
		ArrayList<Character> r3 = new ArrayList<Character>();
		r3.add('.');r3.add('9');r3.add('8');r3.add('.');r3.add('.');
		r3.add('.');r3.add('.');r3.add('6');r3.add('.');
		a.add(r3);
		ArrayList<Character> r4 = new ArrayList<Character>();
		r4.add('8');r4.add('.');r4.add('.');r4.add('.');r4.add('6');
		r4.add('.');r4.add('.');r4.add('.');r4.add('3');
		a.add(r4);
		ArrayList<Character> r5 = new ArrayList<Character>();
		r5.add('4');r5.add('.');r5.add('.');r5.add('8');r5.add('.');
		r5.add('3');r5.add('.');r5.add('.');r5.add('1');
		a.add(r5);
		ArrayList<Character> r6 = new ArrayList<Character>();
		r6.add('7');r6.add('.');r6.add('.');r6.add('.');r6.add('2');
		r6.add('.');r6.add('.');r6.add('.');r6.add('6');
		a.add(r6);
		ArrayList<Character> r7 = new ArrayList<Character>();
		r7.add('.');r7.add('6');r7.add('.');r7.add('.');r7.add('.');
		r7.add('.');r7.add('2');r7.add('8');r7.add('.');
		a.add(r7);
		ArrayList<Character> r8 = new ArrayList<Character>();
		r8.add('.');r8.add('.');r8.add('.');r8.add('4');r8.add('1');
		r8.add('9');r8.add('.');r8.add('.');r8.add('5');
		a.add(r8);
		ArrayList<Character> r9 = new ArrayList<Character>();
		r9.add('.');r9.add('.');r9.add('.');r9.add('.');r9.add('8');
		r9.add('.');r9.add('.');r9.add('7');r9.add('9');
		a.add(r9);
		// [[53..7....], [6..195...], [.98....6.], [8...6...3], 
		//[4..8.3..1], [7...2...6], [.6....28.], [...419..5], [....8..79]]
		return a;
	}
	
	public static void solveSudoku(ArrayList<ArrayList<Character>> a) {
		
		boolean[][] status = new boolean[10][10];
		int[][] sudoko = new int[10][10];
		int emptyCells = 0;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(a.get(i-1).get(j-1)=='.') {
					sudoko[i][j] = 0;
					status[i][j] = true;
					emptyCells++;
				} else {
					sudoko[i][j] = (int)a.get(i-1).get(j-1)-48;
					status[i][j] = false;
				}
			}
		}
		SudokoNode[][] number = new SudokoNode[10][10];
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				SudokoNode node = new SudokoNode();
				number[i][j] = node;
				if(status[i][j]) {
					for(int k=1;k<10;k++) {
						if(!status[i][k]) {
							number[i][j].array.add(sudoko[i][k]);
						}
					}
					
					for(int k=1;k<10;k++) {
						if(!status[k][j]) {
							number[i][j].array.add(sudoko[k][j]);
						}
					}
				}
			}
		}
		solveSudokos(1,1,number,emptyCells,0,sudoko,status);
		
	}

	private static void solveSudokos(int row, int column, SudokoNode[][] number,
			int emptyCells, int total, int[][] sudoko, boolean[][] status) {
		if(total==emptyCells) {
			return ;
		}
		if(column>10) {
			solveSudokos(row+1, column, number, emptyCells, total, sudoko, status);
			return;
		}
		if(!status[row][column]) {
			solveSudokos(row, column+1, number, emptyCells, total, sudoko, status);
			return;
		}
		for(int i=0;i<number[row][column].array.size();i++) {
			int num = number[row][column].array.get(i);
			removeNum(row,column,num,status,number);
			sudoko[row][column] = num;
			status[row][column] = false;
			solveSudokos(row, column+1, number, emptyCells, total+1, sudoko, status);
			addNum(row, column, num, status, number);
			sudoko[row][column] = 0;
			status[row][column] = true;
		}
		
	}

	private static void removeNum(int row, int column, int num, boolean[][] status, 
			SudokoNode[][] number) {
		for(int i=row;i<10;i++) {
			if(status[i][column]) {
				number[i][column].array.remove(new Integer(num));
			}
		}
		
		for(int i=column+1;i<10;i++) {
			if(status[row][i]) {
				number[row][i].array.remove(num);
			}
		}
	}
	
	private static void addNum(int row, int column, int num, boolean[][] status, 
			SudokoNode[][] number) {
		for(int i=row;i<10;i++) {
			if(status[i][column]) {
				number[i][column].array.add(num);
			}
		}
		
		for(int i=column+1;i<10;i++) {
			if(status[row][i]) {
				number[row][i].array.add(num);
			}
		}
	}
	

}
class SudokoNode {
	ArrayList<Integer> array;
	
	public SudokoNode() {
		this.array = new ArrayList<Integer>();
	}
}
