package com.code.interview.bit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IsValidSudoko {
	public static void main(String[] args) {
		List<String> a = Arrays.asList("53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79");
		isValidSudoku(a);
	}
	public static int isValidSudoku(final List<String> a) {
		char[][] board = new char[9][9];
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.get(i).length();j++) {
				board[i][j] = a.get(i).charAt(j);
			}
		}
		if(isValidSudoku(board)) {
			return 1;
		}
		return 0;
		
	}
	public static boolean isValidSudoku(char[][] board) {
	    for(int i = 0; i<9; i++){
	        Set<Character> rows = new HashSet<Character>();
	        Set<Character> columns = new HashSet<Character>();
	        Set<Character> cube = new HashSet<Character>();
	        for (int j = 0; j < 9;j++){
	            if(board[i][j]!='.' && !rows.add(board[i][j]))
	                return false;
	            if(board[j][i]!='.' && !columns.add(board[j][i]))
	                return false;
	            int RowIndex = 3*(i/3);
	            int ColIndex = 3*(i%3);
	            System.out.println("For i and j: "+i+", "+j);
	            System.out.println(RowIndex+" "+ColIndex);
	            
	            
	            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
	                return false;
	            System.out.println( (RowIndex + j/3)+", "+ (ColIndex + j%3));
	            System.out.println();
	        }
	    }
	    return true;
	}

}
