package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logs {
	public static void main(String[] args) throws IOException {
		// Open the file
		FileInputStream fstream = new FileInputStream("/home/local/JASPERINDIA/rajesh.verma/Documents/LogsTest/AllAPI.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine);
		}

		//Close the input stream
		br.close();
	}
	

}
