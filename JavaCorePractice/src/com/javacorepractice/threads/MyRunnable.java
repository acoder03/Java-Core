package com.javacorepractice.threads;

public class MyRunnable implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("aayush");

	}
}