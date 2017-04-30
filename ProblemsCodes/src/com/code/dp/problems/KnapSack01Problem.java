package com.code.dp.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KnapSack01Problem {

	public static void main(String[] args) {
		Scanner  input = ScannerObject.getScanner();
		int  maxCapacity = input.nextInt();
		int numberOfItem = input.nextInt();
		List<WeightAndValue> list = new ArrayList<WeightAndValue>();
		for(int i=1;i<=numberOfItem;i++) {
			WeightAndValue weightAndValue = new WeightAndValue();
			weightAndValue.wieght = input.nextInt();
			weightAndValue.value  = input.nextInt();
			list.add(weightAndValue);
		}
		
	}
	

}

class WeightAndValue{
	int wieght,value;
}
