package threadpgm;



public class threadwithrunnable {
	
	//Class implements Runnable to MyRunnable class , because of using implements (Runnable are an interface builtin)
	//So automatically java pushes ( public void run()  ) method .
	public static class MyRunnable implements Runnable{

		@Override
		public void run() {
			System.out.println("Runnable thread");
		}
		
	}

	public static void main(String[] args) {
		//Main class object contains (new MyRunnable() ) which can be called using (th.start();)
		Thread th = new Thread(new MyRunnable() );
		th.start();
	}

}

/*
Runnable thread
*/