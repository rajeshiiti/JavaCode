package com.java.design.pattern.principle;

public class DIPBadMainClass {
	
	public static void main(String[] args) {
		DIPBadManager manager = new DIPBadManager();
		DIPBadWorkers worker = new DIPBadWorkers();
		manager.setWorker(worker);
		manager.manageWoker();
		
		DIPBadSuperWorkers superWorker = new DIPBadSuperWorkers();
		manager.setSuperWorker(superWorker);
		manager.manageSuperWorker();
	}

}
