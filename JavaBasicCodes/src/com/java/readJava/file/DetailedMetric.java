package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DetailedMetric {
	public static void main(String[] args) throws IOException {
		File folder = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/DetailedMetric");
		File[] listOfFiles = folder.listFiles();
		long total = 0;
		System.out.println(listOfFiles.length);
		for(File file : listOfFiles) {
			total = total + readFile(file);
		}
		System.out.println("total: "+total);
	}
	
	
	public static int readFile(File file) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
		int cnt =0;
		String line = null;
		while ((line = br.readLine()) != null) {
			if(line != null && !line.isEmpty() 
					&& line.contains("UserServiceImpl.createSocialUser.FCUMSServiceImpl.createSocialUser.reqCount")) {
				cnt ++;
			}
		}
		System.out.println(file+": "+cnt);
		br.close();
		return cnt;
	}

}
