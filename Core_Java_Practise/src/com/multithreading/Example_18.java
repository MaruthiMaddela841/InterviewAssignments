package com.multithreading;

class MyThread_18 extends Thread {
	
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

public class Example_18 {

	public static void main(String[] args) throws InterruptedException {

		
		MyThread_18.mt=Thread.currentThread();
		MyThread_18 t=new MyThread_18();
		t.start();
		t.join();//deadlock
		for (int i = 1; i <= 5; i++) {
			System.out.println("Rama thread");
			 Thread.sleep(2000);
		}
	}
}