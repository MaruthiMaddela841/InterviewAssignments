package com.multithreading;

class MyThread_15 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
			Thread.yield();//line-1
		}
	}
}

public class Example_15 {

	public static void main(String[] args) {
		
		MyThread_15 t= new MyThread_15();
		 t.start();
		 for (int i=1; i<=5; i++){
		 System.out.println("Main thread");
		 }
	}
}