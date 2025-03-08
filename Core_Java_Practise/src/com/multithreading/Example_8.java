package com.multithreading;

class MyRunnable_8 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
			 System.out.println("child thread");
		
	}
	
}

public class Example_8 {

	public static void main(String[] args) {

		MyRunnable_8 mr1 = new MyRunnable_8();
		Thread t1=new Thread(mr1);
		t1.start();
		for(int i=1;i<=10;i++)
			System.out.println("main method");
		
	}

}
