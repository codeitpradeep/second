package threadpgm;
/**
come to a situation where multiple threads try to access the
 same resources and finally produce erroneous and unforeseen results. 
 
So it needs to be made sure by some synchronization method that
 only one thread can access the resource at a given point of time.
 
 Java programming language provide two synchronization idioms:

-Methods synchronization
-Statement(s) synchronization (Block synchronization)
 */


class Line{

	synchronized public  void getline() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++)
        {
            System.out.println(i + Thread.currentThread().getName());
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
	}
	
}

class Train extends Thread{
	Line ln;
	public Train(Line ln) {
		this.ln = ln;
	}
	
	public void run(){
		ln.getline();
	}
	
}
public class SynchronizedThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Line ln= new Line();
     Train t1 = new Train(ln);
     Train t2 = new Train(ln);
     
     t1.start();
     t2.start();
     
	}

}
