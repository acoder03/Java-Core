package com.javacorepractice.threads;
/*
 * 
 * Thread.currentThread()
 * 
 * 
 * 
 * 
 */
public class MyRunnable implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("anji Thread"); // main thread name change
		System.out.println(Thread.currentThread().getName());
		System.out.println("aayush");
		System.out.println(10/0);

	}
}

class test1
{
	public static void main (String args[])
	{
		MyRunnable r = new MyRunnable();
		
		Thread t= new Thread(r);
		t.start();
	}
}