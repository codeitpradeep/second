package genCollection;

import java.util.*;

public class newlistprat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("one", "Pradeep");
		hm.put("two", "Vijay");
		hm.put("three", "Ajith");
		hm.put("four", "Surya");
		
		for(Map.Entry m:hm.entrySet() ){
			System.out.println(m.getKey()+" key its value "+m.getValue());
		}
		
		 

	}

}
