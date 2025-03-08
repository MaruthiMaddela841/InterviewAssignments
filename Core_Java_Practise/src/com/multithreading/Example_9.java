package com.multithreading;

class MyThread_9 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
			 System.out.println("MyThread thread");
	}
}

class MyRunnable_9 implements Runnable {

	@Override
	public void run() {
		
		for(int i=1;i<=10;i++)
			 System.out.println("MyRunnable thread");
		
	}
	
}

public class Example_9 {

	public static void main(String[] args) {

		MyRunnable_9 mr1 = new MyRunnable_9();
		MyThread_9 mt1=new MyThread_9();
		Thread t1=new Thread(mr1);
		Thread t2=new Thread(mt1);
		Thread t3=new Thread();
		t1.start();
		t2.start();
		t3.start();
		for(int i=1;i<=10;i++)
			System.out.println("main method");
		
	}

}
