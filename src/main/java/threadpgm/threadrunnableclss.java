package threadpgm;

public class threadrunnableclss {

	public static void main(String[] args) {
		Runnable runnable = new Runnable(){

			@Override
			public void run() {
				System.out.println("Runnable as class type");
			}
			
		};
		
		
		Thread t = new Thread( runnable );
		t.start();
	}

}
/*
Runnable as class type
*/