package genCollection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadsafeHashmp {

	public static void main(String[] args) {
			Map<Integer,String> mp = new HashMap<>();
			
			mp.put(1, "AAAA");
			mp.put(2, "BBB");
			// Collections.synchronizedMap 
			Map<Integer,String> mp2 = Collections.synchronizedMap(mp);
			System.out.println(""+mp2);//{1=AAAA, 2=BBB}
			//
			ConcurrentHashMap<Integer,String> cp = new ConcurrentHashMap<>();
			cp.putAll(mp);
			System.out.println("ConcurrentHashMap\n"+cp);//{1=AAAA, 2=BBB}
	}

}
