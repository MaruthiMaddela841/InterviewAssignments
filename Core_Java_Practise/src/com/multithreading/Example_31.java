package com.multithreading;

public class Example_31 extends Thread {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().isDaemon());// false
		//Thread.currentThread().setDaemon(true);// RE:IllegalThreadStartException
		Example_31 t = new Example_31();
		System.out.println(t.isDaemon());// false
		t.setDaemon(true);
		t.start();
		System.out.println(t.isDaemon());// true
	}
}