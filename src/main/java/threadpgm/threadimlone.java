package threadpgm;

/**
Multithreading is a Java feature that allows concurrent execution of two or more parts 
of a program for maximum utilization of CPU. Each part of such program is called a thread. 
So, threads are light-weight processes within a process.

Extending the Thread class 
Implementing the Runnable Interface

 */

public class threadimlone {
	//( extends Thread ) we extend superclass as thread 
	// first part we use run() method to execute thread
	public static class Mythread extends Thread {
		public void run(){
		System.out.println("New thread Started");
		}
	}
		
	public static void main(String[] args) {
		//Mythread create as a class object inside main class 
		Mythread t = new Mythread();
		// obj.start() default method name to start the thread
		// it will move to thread class where we defined
		t.start();
	}

}

/*
New thread Started

Code explain - thread using start() at main method ,calling run() inside class .
*/