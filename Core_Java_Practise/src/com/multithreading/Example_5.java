package com.multithreading;

class MyThread5 extends Thread {

	@Override
	public void run() {
		System.out.println("no arg method");
	}
	@Override
	public void start() {
		System.out.println("start arg method");
	}
}

public class Example_5 {

	public static void main(String[] args) {

		MyThread5 mt1 = new MyThread5();
		mt1.start();

	}

}
