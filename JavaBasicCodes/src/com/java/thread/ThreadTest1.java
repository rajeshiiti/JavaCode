package com.java.thread;

public class ThreadTest1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadEx1 tr1 = new ThreadEx1("thread1");
		tr1.start();
		
		ThreadEx1 tr2 = new ThreadEx1("thread2");
		tr2.start();
		
		/*ThreadEx2 tr2 = new ThreadEx2();
		Thread th = new Thread(tr2);
		th.start();*/
	}
	
}
class ThreadEx1 extends Thread {
	public ThreadEx1(String threadName) {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("ThreadName: "+Thread.currentThread().getName());
		Calculator calc = Calculator.getCalculatorInstance();
		int val = (int)(int)(Math.random()*10.0);
		try {
			Thread.sleep((long)val*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calc.add(val);
		System.out.println("value is: "+calc.value+" generated value is:"+val);
	}
}

class ThreadEx2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Thread is Running from runnable");
		//run();
	}
}

class Calculator {
	final static Calculator calc = new Calculator();
	
	protected int value;
	private Calculator(){
		this.value = 0;
	}
	public static Calculator getCalculatorInstance() {
		return calc;
	}
	
	public int add(int num) {
		this.value = this.value + num;
		return value;
	}
}
