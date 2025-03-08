package com.multithreading;

class MyThread_13 extends Thread{
	
}

public class Example_13 {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Priority::"+Thread.currentThread().getPriority());
		MyThread_13 mt1=new MyThread_13();
		System.out.println("Child Thread Priority::"+mt1.getPriority());
		System.out.println("*******************************");
		Thread.currentThread().setPriority(7);
		System.out.println("Main Thread Priority::"+Thread.currentThread().getPriority());
		System.out.println("Child Thread Priority::"+mt1.getPriority());
		System.out.println("*******************************");
		MyThread_13 mt2=new MyThread_13();
		System.out.println("Child2 Thread Priority::"+mt2.getPriority());
	}

}
