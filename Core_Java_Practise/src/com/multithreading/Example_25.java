package com.multithreading;

class Display_4 {
	public void wish(String name) {
		;
		; // l-lakh lines of code
		synchronized (this) {
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

class MyThread_25 extends Thread {
	Display_4 d;
	String name;

	MyThread_25(Display_4 d, String name) {
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class Example_25 {

	public static void main(String[] args) {

		Display_4 d1 = new Display_4();
		Display_4 d2 = new Display_4();
		MyThread_25 mt1 = new MyThread_25(d1, "Maru");
		MyThread_25 mt2 = new MyThread_25(d1, "Mike");
		mt1.start();
		mt2.start();
	}
}