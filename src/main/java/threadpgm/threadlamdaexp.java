package threadpgm;

public class threadlamdaexp {

	public static void main(String[] args) {
		
		//Lamda exp we defined the Runnable variable and get ready to execute thread
		Runnable runnable = () -> {
			System.out.println("Showing thread");
			String threadname = Thread.currentThread().getName();
			System.out.printf("Thread name %s- is running" , threadname);
		};
		
		
		//We create an parameter as constructor passing into Thread
		Thread t = new Thread ( runnable , "Here my thread");
		t.start();

	}

}

/*
Showing thread
Thread name Here my thread- is running
*/