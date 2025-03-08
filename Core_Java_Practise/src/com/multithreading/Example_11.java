package com.multithreading;

class MyThread_11 extends Thread{
	@Override
	public void run() {
		
	}
}

public class Example_11 {

	public static void main(String[] args) {
		
		MyThread_11 mt1=new MyThread_11();
		mt1.start();
		System.out.println("mt1 name::"+mt1.getName());
		System.out.println("main name::"+Thread.currentThread().getName());
		mt1.setName("child");
		Thread.currentThread().setName("Parent");
		System.out.println("*******************************");
		System.out.println("mt1 name::"+mt1.getName());
		System.out.println("main name::"+Thread.currentThread().getName());
		System.out.println("*******************************");
		System.out.println(10/0);
	}

}
