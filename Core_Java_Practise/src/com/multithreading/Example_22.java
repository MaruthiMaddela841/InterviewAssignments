package com.multithreading;

class Display_1 {
	public synchronized void wish(String name) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyThread_22 extends Thread {

	Display_1 d;
	String name;

	public MyThread_22(Display_1 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class Example_22 {

	public static void main(String[] args) {

		Display_1 d1 = new Display_1();
		Display_1 d2 = new Display_1();
		MyThread_22 mt1 = new MyThread_22(d1, "Maru");
		MyThread_22 mt2 = new MyThread_22(d2, "Mike");
		mt1.start();
		mt2.start();
	}
}