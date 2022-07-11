package threadpgm;

import java.util.Scanner;

public class PC {

	public void produce() throws InterruptedException {
		// TODO Auto-generated method stub
		
		synchronized(this){
			System.out.println("---Produce running");
			
			wait();
			
			System.out.println("----Resume");
		}
		
	}

	public void consume() throws InterruptedException {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Scanner s = new Scanner(System.in);
        
		synchronized(this){
			System.out.println("---Waiting for return key");
			s.nextLine();
			System.out.println("---Return key Pressed");
			notify();
			
			Thread.sleep(2000);
			
		}
	}

}
