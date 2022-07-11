package threadSync;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class SharedProductResourse {

	private Map<String,Integer> mp =new  HashMap<>();
	public SharedProductResourse() {
		// TODO Auto-generated constructor stub
		mp.put("PEN", new Integer(10));
		mp.put("BOOK", new Integer(1));
		
	}

	
	void getall(){
		System.out.printf(buyProduct("BOOK"));
		System.out.printf(buyProduct("BOOK"));
	}
	
	
	public synchronized String buyProduct(String key){
		if(mp.containsKey(key)){
			Integer quantity = mp.get(key);
			if(!quantity.equals(new Integer(0))){
				mp.put(key, (quantity-1));
				
				return "Processed successfull "+Thread.currentThread().getName();
			}

		}
		
		return "Out of Stock "+Thread.currentThread().getName();
		
	}
}
