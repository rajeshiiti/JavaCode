package com.java.memory;

public class GarbageCollectorMainClass {

	public static void main(String[] args) {

		Runtime runTime = Runtime.getRuntime();
		
		System.out.println("Total Memory: "+ (runTime.totalMemory())/(1024*1024));
		System.out.println("Free Memory: "+ runTime.freeMemory()/(1024*1024));
		System.out.println("Max Memory: "+ runTime.maxMemory()/(1024*1024));
		System.out.println("Available processors: "+ runTime.availableProcessors());
		
		for(int i=0;i<1000000;i++) {
			GarbageCollectorCustomer gcCustomer = new GarbageCollectorCustomer("Ram");
			
		}
		System.out.println("Available Free Memory: "+ runTime.freeMemory()/(1024*1024));
		runTime.gc();
		// Runtime.getRuntime().gc() is equavalent to System.gc()  
		System.out.println("Available Free Memory: "+ runTime.freeMemory()/(1024*1024));
		// Best 
		System.out.println(System.lineSeparator());
	}

}
