package com.multithreading;

class MyThread_17 extends Thread {
	
	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println("Sita Thread");
		}
	}
}

public class Example_17 {

	public static void main(String[] args) throws InterruptedException {

		
		MyThread_17.mt=Thread.currentThread();
		MyThread_17 t=new MyThread_17();
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Rama thread");
			 Thread.sleep(2000);
		}
	}
}