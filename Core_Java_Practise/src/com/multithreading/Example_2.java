package com.multithreading;

class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Example_2 {

	public static void main(String[] args) {
		
		MyThread2 mt1=new MyThread2();
		mt1.run();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

	}

}
