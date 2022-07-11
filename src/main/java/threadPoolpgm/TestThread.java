package threadPoolpgm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
A server that creates a new thread for every request would 
spend more time and consume more system resources in creating and 
destroying threads than processing actual requests.

Since active threads consume system resources, a JVM creating too many
 threads at the same time can cause the system to run out of memory.

A thread pool reuses previously created threads to execute current
 tasks and offers a solution to the problem of thread cycle overhead 
 and resource thrashing 
 
 */



public class TestThread {
	static final int Max_t = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 =new Task("task 1");
		Runnable r2 =new Task("task 2");
		Runnable r3 =new Task("task 3");
		Runnable r4 =new Task("task 4");
		Runnable r5 =new Task("task 5");
		
		ExecutorService pool = Executors.newFixedThreadPool(Max_t);
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();
	}

}
