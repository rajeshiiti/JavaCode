package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class PutApiValue {
	public static void main(String[] args) throws IOException {
		List<String> readData = getAllTaskList("/home/local/JASPERINDIA/rajesh.verma/Desktop/allTask.txt");
		writeInAfile(readData);
	}

	private static void writeInAfile(List<String> readData) throws FileNotFoundException, UnsupportedEncodingException {
		String fileName1="/home/local/JASPERINDIA/rajesh.verma/Desktop/allTask1.txt";
		PrintWriter writer = new PrintWriter(fileName1, "UTF-8");
		for(String str:readData) {
			str=str+"\n";
			writer.write(str);
		}
		writer.close();
	}

	private static List<String> getAllTaskList(String fileName) throws IOException {
		List<Obj> apiData = getApisDataList("/home/local/JASPERINDIA/rajesh.verma/Desktop/apiData.txt");
		System.out.println(apiData.size());
		
		File clientFile = new File(fileName);
		FileInputStream fis = new FileInputStream(clientFile);
		List<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				if(str.length>=3) {
					int i=0;
					while( !("PUT".equals(str[i])) 
							&& !("POST".equals(str[i]))
							&& !("GET".equals(str[i]))
							&& !("DELETE".equals(str[i]))){
								i++;
								if(i>=3)
									break;
							}
					if(i>=3) {
						list.add(line);
						continue; }
				line = getfunctionMacthing(str[i].trim()+str[i+1].trim(),apiData)+" "+ line;
				list.add(line);
				}
			}
		} catch(Exception e) {
			
		}
		br.close();
		return list;
			
	}

	private static String getfunctionMacthing(String string, List<Obj> apiData) throws Exception {
		for(Obj obj:apiData) {
			if(obj.getApi().equals(string))
				return obj.getFunction();
		}
		return "";
	}

	private static List<Obj> getApisDataList(String fileName) throws IOException {

		File clientFile = new File(fileName);
		FileInputStream fis = new FileInputStream(clientFile);
		List<Obj> list = new ArrayList<Obj>();
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				String[] str = line.split("\t");
				if(str.length>=3) {
				Obj obj = new Obj();
				obj.setApi(str[0].trim()+str[1].trim());
				obj.setFunction(str[2].trim());
				list.add(obj);
				}
			}
		} catch(Exception e) {
			
		}
		br.close();
		return list;
	}
}
class Obj{
	private String function;
	private String api;

	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}

}
