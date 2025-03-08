package com.multithreading;

class Display_2 {
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

class MyThread_23 extends Thread {

	Display_2 d;
	String name;

	public MyThread_23(Display_2 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class Example_23 {

	public static void main(String[] args) {

		Display_2 d1 = new Display_2();
		MyThread_23 mt1 = new MyThread_23(d1, "Maru");
		MyThread_23 mt2 = new MyThread_23(d1, "Mike");
		mt1.start();
		mt2.start();
	}
}