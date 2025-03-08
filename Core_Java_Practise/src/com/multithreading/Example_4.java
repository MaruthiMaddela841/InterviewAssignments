package com.multithreading;

class MyThread4 extends Thread {

	public void run() {
		System.out.println("no arg method");
	}

	public void run(int i) {
		System.out.println("one arg method");
	}
}

public class Example_4 {

	public static void main(String[] args) {

		MyThread4 mt1 = new MyThread4();
		mt1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
