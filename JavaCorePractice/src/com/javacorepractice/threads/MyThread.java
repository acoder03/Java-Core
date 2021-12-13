package com.javacorepractice.threads;

/* two ways to make threads 
 * 1. by extending Thread class - it contains start() method and Thread class also 
 * 		 implements Runnable interface
 * 2. by implements Runnable interface -- it does not have start() method so indirectly 
 * we have to call Thread class and pass instance of Runnable type to it 
 * 3. run() method must be overridden because it have empty implementation in super classes
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MyThread extends Thread {

	public void run() { // t.start() always call no-args run method

		System.out.println("child class");
	}
	//overloading of run method
	public void run(int i)
	{
		System.out.println("this is overloaded run method"+i);
		
	}
	//overriding of start method
//	public void start()
//	{
//		
//	}

}
class Test2
{
	public static void main (String args[])
	{
		MyThread t = new MyThread() ;
		
		t.start();
		
		System.out.println("main thread");
	}
}
