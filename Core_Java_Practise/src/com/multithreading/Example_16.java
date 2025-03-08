package com.multithreading;

class MyThread_16 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Sita Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class Example_16 {

	public static void main(String[] args) throws InterruptedException {

		MyThread_16 t = new MyThread_16();
		t.start();
		t.join(10000);//line-n1
		for (int i = 1; i <= 5; i++) {
			System.out.println("Rama thread");
		}
	}
}