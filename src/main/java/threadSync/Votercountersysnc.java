package threadSync;


class Voteconter implements Runnable{
	private int counter = 0;

	
	
	public int getCounter() {
		return counter;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}



	@Override
	public void run() {
		System.out.println("Before"+getCounter());
		synchronized(this){
		setCounter(getCounter()+1);
		}
		System.out.println("After"+getCounter());
	}
	
}

public class Votercountersysnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voteconter vc = new Voteconter();
		
		Thread t1 = new Thread(vc, "State 1");
		Thread t2 = new Thread(vc, "State 2");
		Thread t3 = new Thread(vc, "State 3");
		Thread t4 = new Thread(vc, "State 4");
		

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
