package com.code.dp.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingList {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		List<DataType> list = new ArrayList<DataType>();
		DataType dataType = new DataType();
		dataType.setValue(inp.nextInt());
		dataType.setGenerated(-1);
		list.add(dataType);
		for(int i=1;i<n;i++) {
			DataType dataType1 = new DataType();
			dataType1.setValue(inp.nextInt());
			dataType1.setGenerated(getValue(dataType1.getValue(),list.get(i-1).getValue()));
			list.add(dataType1);
		}
		inp.close();
		System.out.println(getAns(list)+1);	

	}

	public static int getAns(List<DataType> list) {
		int ans = 0;
		int total = 0;
		for(DataType type:list) {
			if(type.getGenerated() == -1){
				ans = Math.max(ans, total);
				total = 0;
			} else {
				total ++ ;
			}
		}
		ans = Math.max(ans, total);

		return ans;
	}

	private static int getValue(int value, int value2) {
		if(value<value2) 
			return -1;
		return 1;
	}

}

class DataType {
	private int value;
	private int generated;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getGenerated() {
		return generated;
	}
	public void setGenerated(int generated) {
		this.generated = generated;
	}
	
	
	
}
