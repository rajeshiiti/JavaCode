package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadAllClientsFiles {
	
	public static void main(String[] args) throws IOException {
		File clientFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ClientIds.txt");

		File clientFileWithIdPlatformMerchant = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ClientWithNameIDAndPlatForm.txt");

		List<String> clientList = readClientFile(clientFile);
		

		Map<String,ClientWithIdPlatformMerchant>  clientListWithIdPlatformMerchant = readClientWithIdPlatformMerchant(clientFileWithIdPlatformMerchant,clientList);;

		Map<String,ApiAndCount> totalApiMap = getMap(); 
		

		String fileName="/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ReadAllClientDetails/clienApisTotalCalls.txt";
		PrintWriter writer = new PrintWriter(fileName, "UTF-8");
		//String clientName = clientList.get(0);
		for(String clientName: clientList) {
			File clientTextFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ReadAllClientDetails/"+clientName+".txt");
			FileInputStream fis = new FileInputStream(clientTextFile);
			task3(fis,clientListWithIdPlatformMerchant.get(clientName));
			//task2(fis,totalApiMap,clientListWithIdPlatformMerchant.get(clientName));
			//task1(fis,clientListWithIdPlatformMerchant.get(clientName));
		}
		printMap(totalApiMap);
		writer.close();
		System.out.println("Done");
		
	}
	private static void printMap(Map<String, ApiAndCount> totalApiMap) {
		for(ApiAndCount str:totalApiMap.values()) {
			if(str.getCount()>0) {
				System.out.println(str.getApiName()+"\t"+str.getCount() + "\t"+str.getCount()*56);
			}
		}
		
	}
	private static void task2(FileInputStream fis,
			Map<String, ApiAndCount> totalApiMap,
			ClientWithIdPlatformMerchant clientWithIdPlatformMerchant) throws NumberFormatException, IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));
				String line = null;
				long tmp = 0;
				try {
					while ((line = br.readLine()) != null) {
						if(!line.isEmpty()) {
							String[] strings = line.split(" ");
							if(strings.length == 1) {
							}else if(strings.length>=4) {
								if(Integer.parseInt(strings[1])>0) {
									String api =  ((strings[2] +" "+ strings[3]).replace('[', ' ')).replace(']', ' ');
									long cnt  = totalApiMap.get(api).getCount();
									totalApiMap.get(api).setCount(cnt +  Long.parseLong(strings[1]));
								}
							}
						}
				} }catch (ArrayIndexOutOfBoundsException e) {
					
				}
				if(tmp>0) {
					System.out.println(clientWithIdPlatformMerchant.getClientId()+"\t"+ 
							clientWithIdPlatformMerchant.getClientMerchant()+"\t"+clientWithIdPlatformMerchant.getClientPlatForm() + "\t"+ tmp + "\t"+ tmp*56);
				}
				br.close();
		
		// TODO Auto-generated method stub
		
	}
	
	
	private static void task3(FileInputStream fis,
			ClientWithIdPlatformMerchant clientWithIdPlatformMerchant) throws NumberFormatException, IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));
				String line = null;
				long tmp = 0;
				System.out.println("\n\n"+clientWithIdPlatformMerchant.getClientId()+" "+ 
						clientWithIdPlatformMerchant.getClientMerchant()+" "+clientWithIdPlatformMerchant.getClientPlatForm()+"\n");
				try {
					while ((line = br.readLine()) != null) {
						if(!line.isEmpty()) {
							String[] strings = line.split(" ");
							if(strings.length == 1) {
							}else if(strings.length>=4) {
								if(Integer.parseInt(strings[1])>0) {
									String api =  ((strings[2] +" "+ strings[3]).replace('[', ' ')).replace(']', ' ');
									System.out.println(api+"\t"+Long.parseLong(strings[1])+"\t" +Long.parseLong(strings[1])*56);
								}
							}
						}
				} }catch (ArrayIndexOutOfBoundsException e) {
					
				}
				if(tmp>0) {
				}
				br.close();
		
		// TODO Auto-generated method stub
		
	}
	
	private static Map<String, ApiAndCount> getMap() throws NumberFormatException, IOException {
		File clientTextFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/logs/ReadAllClientDetails/84DEF6C284B5F53D.txt");
		FileInputStream fis = new FileInputStream(clientTextFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		Map<String,ApiAndCount> map = new HashMap<String,ApiAndCount>();
		long tmp = 0;
		try {
			while ((line = br.readLine()) != null) {
				if(!line.isEmpty()) {
					String[] strings = line.split(" ");
					if(strings.length == 1) {
					}else if(strings.length>=4) {
							String api =  ((strings[2] +" "+ strings[3]).replace('[', ' ')).replace(']', ' ') ;
							ApiAndCount andCount = new ApiAndCount();
							andCount.setApiName(api);
							andCount.setCount(0);
							map.put(api, andCount);
					}
				}
		} }catch (ArrayIndexOutOfBoundsException e) {
			
		}
		return map;
	}
	public static void task1(FileInputStream fis, ClientWithIdPlatformMerchant clientWithIdPlatformMerchant ) throws IOException {
		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		long tmp = 0;
		try {
			while ((line = br.readLine()) != null) {
				if(!line.isEmpty()) {
					String[] strings = line.split(" ");
					if(strings.length == 1) {
					}else if(strings.length>=4) {
						if(Integer.parseInt(strings[1])>0) {
							//System.out.println( ((strings[2] +" "+ strings[3]).replace('[', ' ')).replace(']', ' ') );
							tmp = tmp+ Integer.parseInt(strings[1]);
						}
					}
				}
		} }catch (ArrayIndexOutOfBoundsException e) {
			
		}
		if(tmp>0) {
			System.out.println(clientWithIdPlatformMerchant.getClientId()+"\t"+ 
					clientWithIdPlatformMerchant.getClientMerchant()+"\t"+clientWithIdPlatformMerchant.getClientPlatForm() + "\t"+ tmp + "\t"+ tmp*56);
		}
		br.close();
	}
	private static Map<String, ClientWithIdPlatformMerchant> readClientWithIdPlatformMerchant(
			File clientFileWithIdPlatformMerchant, List<String> clientList) throws IOException {
		FileInputStream fis = new FileInputStream(clientFileWithIdPlatformMerchant);
		Map<String,ClientWithIdPlatformMerchant> map = new HashMap<String,ClientWithIdPlatformMerchant>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				String[] str = line.split(" ");
				if(str.length>=3) {
					if(clientList.contains(str[1])) {
						ClientWithIdPlatformMerchant merchant = new ClientWithIdPlatformMerchant();
						merchant.setClientId(str[1]);
						merchant.setClientMerchant(str[3]);
						merchant.setClientPlatForm(str[5]);
						map.put(str[1], merchant);
				 }
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
		br.close();
		return map;
	}
	private static List<String> readClientFile(File clientFile) throws IOException {

		List<String> list = new ArrayList<String>();
		FileInputStream fis = new FileInputStream(clientFile);

		// Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				list.add(line.trim());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(list.size() + "\t\t\t" + line.length());
		}
		br.close();
		return list;
	}

}
