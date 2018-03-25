package com.java.readJava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignInSuccessAndFailure {
	public static void main(String[] args) throws IOException {
		
		String apiName = "POST /api/v1/identity/signin/users";
		String clientID = "8E755A453D5306EC";

		File bigFile = new File("/home/local/JASPERINDIA/rajesh.verma/Documents/server_data/s1_access_log.2016-09-30.log");
		ClientSignCount clientSignCount = processActualFileBasedOnClients(bigFile, clientID,apiName);
		System.out.println("\t\tTotal\tSuccess\tFailure");
		System.out.println("Single Server: "+clientSignCount.getTotal()+"\t"+clientSignCount.getSuccess()+"\t"+clientSignCount.getFailure());
		System.out.println("24x:\t\t"+24*clientSignCount.getTotal()+"\t"+24*clientSignCount.getSuccess()+"\t"+24*clientSignCount.getFailure());

	}

	private static ClientSignCount processActualFileBasedOnClients(File file,
			String clientName, String apiName) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		ClientSignCount clientSignCount = new ClientSignCount();
		clientSignCount.setClientId(clientName);
		clientSignCount.setTotal(0);
		clientSignCount.setSuccess(0);
		clientSignCount.setFailure(0);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line = null;
		String signInSuccess = "200 - /api/v1/identity/signin/users";
		String signInFailure = "400 - /api/v1/identity/signin/users";
		long cnt = 0;
		long compare = 1000000;
		while ((line = br.readLine()) != null) {
			if (line.contains(clientName) && line.contains(apiName)) {
				clientSignCount.setTotal(clientSignCount.getTotal() + 1);
				if (line.contains(signInSuccess))
					clientSignCount
							.setSuccess(clientSignCount.getSuccess() + 1);
				if (line.contains(signInFailure))
					clientSignCount
							.setFailure(clientSignCount.getFailure() + 1);
			}
			if(cnt==compare) {
				System.out.println("processing at: "+cnt);
				compare+=1000000;
			}
			cnt++;
		}
		System.out.println("Final line at: "+cnt);
		br.close();

		return clientSignCount;
	}
}
