package com.multithreading;

class MyThread_10 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			 System.out.println("MyThread thread");
	}
}

class MyRunnable_10 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
			 System.out.println("MyRunnable thread");
		
	}
	
}

public class Example_10 {

	public static void main(String[] args) {

		MyRunnable_10 mr1 = new MyRunnable_10();
		MyThread_10 mt1=new MyThread_10();
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mt1);
		Thread t3=new Thread();
		t1.run();
		t2.run();
		t3.run();
		mr1.run();
		for(int i=1;i<=10;i++)
			System.out.println("main method");
		
	}

}
