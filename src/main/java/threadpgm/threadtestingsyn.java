package threadpgm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author admin
 *
 */
class testthread implements Runnable {

	ConcurrentHashMap<Integer,String> cp = new ConcurrentHashMap<>();
	
	
	public ConcurrentHashMap<Integer, String> getCp() {
		return cp;
	}


	public void setCp(ConcurrentHashMap<Integer, String> cp) {
		this.cp = cp;
	}


	@Override
	public void run() {
		for(int i=0; i<=5 ;i++){
		System.out.println(""+getCp()+" of "+Thread.currentThread().getName());
		}
	}
	

}

class testthreadtwo implements Runnable {

	Map<Integer,String> cp = new HashMap<>();
	
	
	public Map<Integer, String> getCp() {
		return cp;
	}


	public void setCp(Map<Integer, String> cp) {
		this.cp = cp;
	}


	@Override
	public void run() {
		for(int i=0; i<=5 ;i++){
		System.out.println(""+getCp()+" of "+Thread.currentThread().getName());
		}
	}
	

}

public class threadtestingsyn{
	public static void main(String[] args) {
 
        Map<Integer,String> mp = new HashMap<>();
		
		mp.put(1, "AAAA");
		mp.put(2, "BBB");
		// Collections.synchronizedMap 
		Map<Integer,String> mp2 = Collections.synchronizedMap(mp);
		
		ConcurrentHashMap<Integer,String> cp = new ConcurrentHashMap<>();
		cp.putAll(mp);
		
		testthread thrcl = new testthread();
		thrcl.setCp(cp);
		
		Thread t1 = new Thread(thrcl);
		Thread t2 = new Thread(thrcl);
		t1.start();
		t2.start();
		
		testthreadtwo thrdtwo = new testthreadtwo();
		thrdtwo.setCp(mp);
		Thread t3 = new Thread(thrdtwo);
		Thread t4 = new Thread(thrdtwo);
		t3.start();
		t4.start();
		
	}
}
