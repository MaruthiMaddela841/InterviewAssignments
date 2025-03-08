package com.multithreading;

class Display_5 {
	public void wish(String name) {
		;
		; // l-lakh lines of code
		synchronized (Display_5.class) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Good morning:" + name);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}

class MyThread_26 extends Thread {
	Display_5 d;
	String name;

	MyThread_26(Display_5 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class Example_26 {

	public static void main(String[] args) {

		Display_5 d1 = new Display_5();
		Display_5 d2 = new Display_5();
		MyThread_26 mt1 = new MyThread_26(d1, "Maru");
		MyThread_26 mt2 = new MyThread_26(d1, "Mike");
		mt1.start();
		mt2.start();
	}
}