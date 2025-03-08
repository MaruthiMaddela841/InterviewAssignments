package com.multithreading;

class MyThread_21 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("I am lazy thread : " + i);
		}
		System.out.println("I am entering into sleeping state");
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}

public class Example_21 {

	public static void main(String[] args) {

		MyThread_21 t = new MyThread_21();
		t.start();
		t.interrupt();// line-n1
		System.out.println("End of Main...");

	}
}