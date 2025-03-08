package com.multithreading;

class ThreadB1 extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Child thread started calculation");
			for (int i = 0; i <= 100; i++) {
				total += i;
			}
			System.out.println("Child thread trying to give notification");
			this.notify();
		}
	}
}

public class Example_28 {

	public static void main(String[] args) throws InterruptedException {

		ThreadB1 b = new ThreadB1();
		b.start();
		//Thread.sleep(10000);// 10sec
		synchronized (b) {
			System.out.println("Main thread is calling wait on B object");
			b.wait();
		//	Thread.sleep(10000);
			System.out.println("Main thread got notification");
			System.out.println(b.total);
		}
	}
}