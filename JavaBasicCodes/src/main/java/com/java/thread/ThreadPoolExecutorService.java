package com.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorService {
	public static void main(String[] args) {
		ExecutorService exceService = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			Runnable worker = new WorkThread(""+i);
			exceService.execute(worker);
		}
		exceService.shutdown();
		while(!exceService.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}
}
