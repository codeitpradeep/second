package genCollection;

import java.util.*;

public class HashMaptoArrayList {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Pradeep");
		hm.put(2, "Vijay");
		hm.put(3, "Ajith");
		hm.put(4, "Surya");
		
		for(Map.Entry mp : hm.entrySet()){
			System.out.println("Key "+mp.getKey());
		}
		
		System.out.println("-------");
		
		hm.forEach((k,v) -> System.out.println("Key in lamda "+k+" Value = "+v));
		
		System.out.println("--Convert Arraylist by keySet--");
		List<Integer> listnum = new ArrayList<>(hm.keySet());
		listnum.forEach((k) ->
			System.out.println("ArrayList key "+k)
		);
		
		System.out.println("--Convert Arraylist by Value--");
		List<String> listname = new ArrayList<>(hm.values());
		
		for(String arlst:listname){
			System.out.println("Arraylist by Value--"+arlst);
		}
		
	}

}
