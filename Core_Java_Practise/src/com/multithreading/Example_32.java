package com.multithreading;

class MyThread_32 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(2000);// 2sec
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class Example_32 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		 MyThread_32 t=new MyThread_32();
		 t.setDaemon(true);//stmt-1
		 t.start();
		 Thread.sleep(10000);
		 System.out.println("end of main thread");
	}
}