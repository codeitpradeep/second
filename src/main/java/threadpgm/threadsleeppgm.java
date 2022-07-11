package threadpgm;

public class threadsleeppgm {

	public static void main(String[] args) {
		
		//Lamda exp we defined the Runnable variable and get ready to execute thread
		Runnable runnable = () -> {
			System.out.println("Showing thread");
			String threadname = Thread.currentThread().getName();
			System.out.printf("Thread name %s- is running\n" , threadname);
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.printf("Thread name %s- Ended\n" , threadname);
		};
				
		//We create an parameter as constructor passing into Thread
		Thread t = new Thread ( runnable , "Here my thread");
		t.start();

	}

}

/*
Showing thread
Thread name Here my thread- is running
Thread name Here my thread- Ended
*/