package com.multithreading;

class MyThread6 extends Thread {

	public void start() {
		super.start();
		System.out.println("start  method");
	}

	public void run() {
		System.out.println("run method");
	}
}

public class Example_6 {

	public static void main(String[] args) {

		MyThread6 mt1 = new MyThread6();
		mt1.start();
		System.out.println("main method");
	}

}
