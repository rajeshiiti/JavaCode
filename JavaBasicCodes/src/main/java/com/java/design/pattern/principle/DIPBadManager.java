package com.java.design.pattern.principle;

public class DIPBadManager {
	
	DIPBadWorkers worker;
	DIPBadSuperWorkers superWorker;
	public void setWorker(DIPBadWorkers worker) {
		this.worker = worker;
	}
	public void setSuperWorker(DIPBadSuperWorkers superWorker) {
		this.superWorker = superWorker;
	}

	public void manageWoker() {
		worker.work();
	}
	public void manageSuperWorker() {
		superWorker.work();
	}

}
