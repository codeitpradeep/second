package threadtwomemoryall;

public class runnablestart {

	public static void main(String[] args) {
		
		MyRunnable runnable = new MyRunnable();
		MyRunnable runnable2 = new MyRunnable();
		
		Thread t = new Thread( runnable );
		Thread t2 = new Thread( runnable2 );
		t.start();
		t2.start();
	}

}
/*
Runnable as class type
*/