package threadpgm;
/**
 * Thread makes it setPriority , but OS sometime make the thread as first Priority
 * Here we use Runnable
 */
class newrunablethreads implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<= 5 ;i++){
			System.out.printf("%s %d \n",Thread.currentThread().getName(),i);
		}
	}

}



public class runablethreads {

	public static void main(String[] args) {
		newrunablethreads rn = new newrunablethreads();

		Thread t1 = new Thread(rn);
		Thread t2 = new Thread(rn);
		Thread t3 = new Thread(rn);
		Thread t4 = new Thread(rn);
		
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1);//Thread[Thread-0,5,main]
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
  