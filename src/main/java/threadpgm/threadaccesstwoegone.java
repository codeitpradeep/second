package threadpgm;

class Mythread extends Thread{
	
	public void run(){
		for(int i=1; i<= 5 ;i++){
			System.out.printf("%s %d \n",Thread.currentThread().getName(),i);
		}
	}
}

public class threadaccesstwoegone {

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		
		t1.start();
		t2.start();
	}

}

/*
First JVM will create two Class objects ready Mythread t1 , t2 ,
while t1 starts , Mythread run() will working on first thread
t2 starts , run() works for t2 
*/
/*
Thread-1 1 
Thread-1 2 
Thread-1 3 
Thread-0 1 
Thread-0 2 
Thread-0 3 
Thread-0 4 
Thread-0 5 
Thread-1 4 
Thread-1 5 
*/