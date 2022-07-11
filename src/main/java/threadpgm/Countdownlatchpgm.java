package threadpgm;

import java.util.concurrent.CountDownLatch;
/**
When we create an object of CountDownLatch, we specify the number 
of threads it should wait for, all such thread are required to do 
count down by calling CountDownLatch.countDown() once they are completed 
or ready to the job. As soon as count reaches zero, the waiting task starts running.

Creating an object of CountDownLatch by passing 
an int to its constructor (the count), is actually number of 
invited parties (threads) for an event.

The thread, which is dependent on other threads to start processing, 
waits on until every other thread has called count down. All threads,
 which are waiting on await() proceed together once count down reaches to zero.
 
countDown() method decrements the count and await() method blocks until count == 0

*/
class Worker extends Thread{
	private CountDownLatch latch;
	private int delay;
	public Worker(int delay, CountDownLatch latch, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.delay = delay;
		this.latch = latch;
	}
	
	public void run(){
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.printf("First has - %s \n", Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class Countdownlatchpgm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(2);
		
		Worker a = new Worker(1000,latch,"Worker-1");
		Worker b = new Worker(2000,latch,"Worker-2");
		Worker c = new Worker(3000,latch,"Worker-3");
		Worker d = new Worker(4000,latch,"Worker-4");
		Worker e = new Worker(5000,latch,"Worker-5");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		
		latch.await();
		
		System.out.printf("%s \n", Thread.currentThread().getName());
		
	}

}
