package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ForIosAppClient {

	public static void main(String[] args) throws IOException {

		File bigFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/access_log.2016-11-12.log");
		List<Integer> list = processActualFileBasedOnIOSClientSignInApi(bigFile);
		int maxi = -1;
		long tmp = 0;
		for(Integer int1:list) {
			tmp = tmp + (long)int1;
			maxi = Math.max(maxi, int1);
		}
		System.out.println(maxi);
		System.out.println(list.size());
		System.out.println(tmp);
		System.out.println();

	}
	
	private static List<Integer> processActualFileBasedOnIOSClientSignInApi(
			File file) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				if (line.contains("97A4C6AABDA5850F") && line.contains("/api/v1/identity/signin/users")) {
					String[] lines = line.split(" ");
					//System.out.println(lines[16].length());
					
					list.add(Integer.parseInt(lines[16]));
				}
			}
			}  catch (ArrayIndexOutOfBoundsException e) {
			
		}

		br.close();
		return list;
	}

}
