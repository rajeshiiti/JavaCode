package com.java.design.pattern.principle;

public class ISPBadWorker implements ISPBadIWorker {

	@Override
	public void work() {
		System.out.println("Worker doing great job...");

	}

	@Override
	public void eat() {
		System.out.println("Worker need one hour lunch");
	}

}
