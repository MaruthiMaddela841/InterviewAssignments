package com.multithreading;

class ThreadB extends Thread {
	int total = 0;

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			total += i;
		}
	}
}

public class Example_27 {

	public static void main(String[] args) throws InterruptedException {

		 ThreadB b=new ThreadB();
		 b.start();
		 //Thread.sleep(10000);
		 //b.join();
		 System.out.println(b.total);
	}
}