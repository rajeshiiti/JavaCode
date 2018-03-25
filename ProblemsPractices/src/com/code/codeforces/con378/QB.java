package com.code.codeforces.con378;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QB {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<PairLeftRight> list = new ArrayList<PairLeftRight>();
		for(int i = 1 ; i <=n ;i ++) {
			PairLeftRight pairLeftRight = new PairLeftRight();
			pairLeftRight.setLeft(inp.nextInt());
			pairLeftRight.setRight(inp.nextInt());
			list.add(pairLeftRight);
		}
		System.out.println(getRowIndex(list));
		inp.close();
	}

	private static int getRowIndex(List<PairLeftRight> list) {
		int totalLeft = 0 ;
		int totalRight = 0;
		for(PairLeftRight pairLeftRight : list) {
			totalLeft = totalLeft + pairLeftRight.getLeft();
			totalRight = totalRight + pairLeftRight.getRight();
		}
		int rowIndex = 0;
		int diff = Math.abs(totalRight-totalLeft);
		int i=1;
		for(PairLeftRight pairLeftRight : list) {
			if(diff< Math.abs(( totalLeft-pairLeftRight.getLeft()+pairLeftRight.getRight()) - (totalRight - pairLeftRight.getRight() + pairLeftRight.getLeft()))) {
				diff = Math.abs(( totalLeft-pairLeftRight.getLeft()+pairLeftRight.getRight()) - (totalRight - pairLeftRight.getRight() + pairLeftRight.getLeft()));
				rowIndex = i;
			}
			i++;
		}
		return rowIndex;
	}

}

class PairLeftRight {
	int left,right;

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
}
