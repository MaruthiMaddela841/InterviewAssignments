package com.multithreading;

class MyThread3 extends Thread {
	//Not Overriding run()
}

public class Example_3 {

	public static void main(String[] args) {
		
		MyThread3 mt1=new MyThread3();
		mt1.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

	}

}
