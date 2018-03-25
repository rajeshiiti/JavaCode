package com.java.design.pattern.principle;

public class ISPBadSuperWorker implements ISPBadIWorker {

	@Override
	public void work() {
		System.out.println("Super worker doing great super job..");
	}

	@Override
	public void eat() {
		System.out.println("Super worker need only half an hour to do job....");
	}

}
