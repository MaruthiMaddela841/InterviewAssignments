package com.multithreading;

class MyThread_20 extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println("I am lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
}

public class Example_20 {

	public static void main(String[] args) {
		
		 MyThread_20 t=new MyThread_20();
		 t.start();
		 t.interrupt();//line-n1
		 System.out.println("End of Main...");
		
	}
}