package com.multithreading;

class MyThread7 extends Thread {

	
}

public class Example_7 {

	public static void main(String[] args) {

		MyThread7 mt1 = new MyThread7();
		mt1.start();
		mt1.start();//java.lang.IllegalThreadStateException
		System.out.println("main method");
	}

}
