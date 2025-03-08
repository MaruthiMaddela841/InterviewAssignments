package com.multithreading;

class MyThread_14 extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Example_14 {

	public static void main(String[] args) {
		
		MyThread_14 t= new MyThread_14();
		 t.setPriority(9);//line -1
		 t.start();
		 for (int i=1; i<=5; i++){
		 System.out.println("Main thread");
		 }
	}
}