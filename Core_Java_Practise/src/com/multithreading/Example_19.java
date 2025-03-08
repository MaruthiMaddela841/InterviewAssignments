package com.multithreading;

public class Example_19 {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Rama thread");
			 Thread.sleep(2000);
		}
	}
}