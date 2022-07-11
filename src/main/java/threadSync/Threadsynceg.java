package threadSync;

class BuyPen implements Runnable{
	SharedProductResourse sp = null;
	BuyPen(SharedProductResourse sp){
		this.sp = sp;
	}
	@Override
	public void run() {
		System.out.println("But Pen - "+sp.buyProduct("PEN"));
	}
	
}
class BuyBook implements Runnable{
	SharedProductResourse sp = null;
	BuyBook(SharedProductResourse sp){
		this.sp = sp;
	}
	@Override
	public void run() {
		System.out.println("But Book - "+sp.buyProduct("BOOK"));
	}
	
}


public class Threadsynceg {

	public static void main(String[] args) {
		SharedProductResourse sp =new SharedProductResourse();
		
		BuyPen buypen = new BuyPen(sp);
		BuyBook buybook = new BuyBook(sp);
		
		Thread t1 = new Thread(buypen, "Student 1");
		Thread t2 = new Thread(buybook, "Student 2");
		Thread t3 = new Thread(buypen, "Student 3");
		Thread t4 = new Thread(buypen, "Student 4");
		Thread t5 = new Thread(buybook, "Student 5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
	}

}
