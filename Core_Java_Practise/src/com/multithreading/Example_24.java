package com.multithreading;

class Display_3 {
	public synchronized void displayNumbers() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

	public synchronized void displayCharacters() {
		for (int i = 65; i <= 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyThread11 extends Thread {
	Display_3 d;

	MyThread11(Display_3 d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayNumbers();
	}
}

class MyThread22 extends Thread {
	Display_3 d;

	MyThread22(Display_3 d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayCharacters();
	}
}

public class Example_24 {

	public static void main(String[] args) {

		Display_3 d1 = new Display_3();
		Display_3 d2 = new Display_3();
		MyThread11 mt1 = new MyThread11(d1);
		MyThread22 mt2 = new MyThread22(d2);
		//MyThread22 mt2 = new MyThread22(d1);
		mt1.start();
		mt2.start();
	}
}