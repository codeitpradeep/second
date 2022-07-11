package threadpgm;

class threadmainrun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("//thread1 as "+threadtestall.t1.getState());
		//thread1 as WAITING
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


public class threadtestall implements Runnable {

	public static Thread t1 ;
	public static threadtestall obj;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 first main object class called -threadtestall()
		obj = new threadtestall();
		t1 = new Thread( obj , "main thread");
		
		System.out.println("//Before running its new state "+t1.getState());
		//Before running its new state NEW
		
		t1.start();
		System.out.println("//After starting thread as "+t1.getState());
		//After starting thread as RUNNABLE
	}

	@Override
	public void run() {
		
		//main thread started here
		System.out.println(""+Thread.currentThread().getName());
		
		threadmainrun thrdmain = new threadmainrun();
		Thread t2 = new Thread( thrdmain , "main thread");
		
		System.out.println("//Before thread2 running its new state "+t2.getState());
		//Before thread2 running its new state NEW
		
		
		t2.start();
		System.out.println("//After thread2 starting thread as "+t2.getState());
		//After thread2 starting thread as RUNNABLE

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("//---After thread2 as "+t2.getState());
		System.out.println("//---After thread1 as "+t1.getState());
		//---After thread2 as TIMED_WAITING
		//---After thread2 as RUNNABLE
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("//thread2 as "+t2.getState());
		//thread2 as TERMINATED
		System.out.println("//thread1 as "+t1.getState());
		//thread1 as RUNNABLE
	}

}

/**
//Before running its new state NEW
//After starting thread as RUNNABLE
main thread
//Before thread2 running its new state NEW
//After thread2 starting thread as RUNNABLE
//---After thread2 as TIMED_WAITING
//thread1 as WAITING
//thread2 as TERMINATED
 */
