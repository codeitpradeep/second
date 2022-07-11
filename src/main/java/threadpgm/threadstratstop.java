package threadpgm;

public class threadstratstop {
	public static class Stoppingrunnable implements Runnable{
		//First it will set ( stopreq = false; ) flag inside class 
		boolean stopreq = false;
		
		public synchronized void requeststop(){
			this.stopreq = true;
			
		}
		
		public synchronized boolean isStopreq(){
			return this.stopreq;	
		}
		
		
		private void sleeping(long milli){
			try {
				Thread.sleep(milli);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//thread will run continusly while the thread starts , when the method requeststop() - Flag initiated to true 
		//thread run stopped

		@Override
		public void run() {
			System.out.println("Stoppable runnable Running");
			while( !isStopreq() ){
				sleeping(1000);
				System.out.println("....");	
			}
			
			System.out.println("Stoppable runnable Stopped");
		}
		
	}
	
	
	public static void main(String []args){
		Stoppingrunnable Stoppingrunnable = new Stoppingrunnable();//We create new class object as Stoppingrunnable() , after creating class it moves to class defined .
		Thread t = new Thread(  Stoppingrunnable );
		t.start();
		try {
			Thread.sleep(5000); //thread will start and connected to run() method 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Start");
		Stoppingrunnable.requeststop(); //By calling method inside ( Stoppingrunnable() ) class 
		System.out.println("All stop");
		
		
	}

}
