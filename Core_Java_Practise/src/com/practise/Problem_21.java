package com.practise;

class ThreadA implements Runnable {
	public Integer total = 0;

	@Override
	public void run() {
		synchronized (total) {
			for (int i = 0; i < 5; i++) {
				total = total + i;
			}
			total.notify();
		}
	}
}

public class Problem_21 {

	public static void main(String[] args) throws InterruptedException {

		ThreadA obj = new ThreadA();
		Thread t = new Thread(obj);
		t.start();
		// 2threads(user defined and main thread)
		synchronized (obj.total) {
			obj.wait();
			System.out.println(obj.total);
		}

	}
}
