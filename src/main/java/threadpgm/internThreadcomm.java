package threadpgm;

/**
Inter-thread Communication in Java 
 What is Polling and what are problems with it?
The process of testing a condition repeatedly till it
 becomes true is known as polling.

Polling is usually implemented with the help of loops to 
check whether a particular condition is true or not. 
If it is true, certain action is taken. This waste many CPU cycles 
and makes the implementation inefficient.
For example, in a classic queuing problem where one thread is
producing data and other is consuming it.

To avoid polling, Java uses three methods, 
namely, wait(), notify() and notifyAll().

 */


public class internThreadcomm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		final PC pc= new PC();
		
		Thread t1 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		Thread t2 = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		System.out.println("Starting threads");
		t1.start();
		t2.start();
				
		t1.join();
		t2.join();
		System.out.println("After joining threads");
	}


}

/**
Code Explain - creating t1,t2 then we start 
final PC pc= new PC(); - object is created and two ( pc.produce(); pc.consume(); ) are 
called inside the two thread run() methods .

pc.produce() - has synchronized use of synchronized block ensures that only one thread at a time runs

pc.consume() - has synchronized use of synchronized block ensures that only one thread at a time runs

produce() - wait() method is called it locked waiting for another thread consume() - to notify()


output
Starting threads
---Produce running
---Waiting for return key

---Return key Pressed
----Resume
After joining threads
 */



