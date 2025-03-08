package com.multithreading;

class A1 {
	public synchronized void d1(B1 b) {
		System.out.println("Thread-1 starts execution of d1()");
		try {
			Thread.sleep(5000);// 5sec
		} catch (InterruptedException e) {
		}
		System.out.println("Thread-1 trying to call b last()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A last() method");
	}
}

class B1 {
	public synchronized void d2(A1 a) {
		System.out.println("Thread-2 starts execution of d2()");
		try {
			Thread.sleep(5000);// 5sec
		} catch (InterruptedException e) {
		}
		System.out.println("Thread-2 trying to call A last()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("Inside B last() method");
	}
}

public class Example_30 extends Thread{

	A1 a = new A1();
	B1 b = new B1();

	public void m1() {
		this.start();
		a.d1(b);// executed by main thread
	}

	public void run() {
		b.d2(a);// executed by child thread
	}

	public static void main(String[] args) throws InterruptedException {
		Example_30 t=new Example_30();
		 t.m1();
	}
}