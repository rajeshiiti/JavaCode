package com.java.file;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		String filePath = "/home/local/JASPERINDIA/rajesh.verma/Documents/JavaCodes/Files/";
		File file = new File(filePath+"createNewFile");
		if(file.createNewFile()) {
			if(file.exists()) {
				System.out.println("file created succuessfully");
			}
		} else {
			
		}
	}

}
