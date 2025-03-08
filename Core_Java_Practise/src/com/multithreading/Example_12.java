package com.multithreading;

class MyThread_12 extends Thread{
	@Override
	public void run() {
		System.out.println("Child code executing by::"+Thread.currentThread().getName());
	}
}

public class Example_12 {

	public static void main(String[] args) {
		
		MyThread_12 mt1=new MyThread_12();
		mt1.start();
		System.out.println("Parent code executing by::"+Thread.currentThread().getName());
	}

}
