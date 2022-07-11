package genCollection;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMappgm {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//  HashMap <key><value> ,Key are unique
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Pradeep");
		hm.put(2, "Vijay");
		hm.put(3, "Ajith");
		hm.put(4, "Surya");
		
		for(Map.Entry m:hm.entrySet() ){
			System.out.println(m.getKey()+" key its value "+m.getValue());
		}
		
		hm.put(5, "Vishal");
		System.out.println("\nNew element put into HashSet -"+hm+"\n"+hm.get(5));
		
		//pullAll - make put two HashSet into single HashSet
		HashMap<Integer,String> scndhm = new HashMap<Integer,String>();
		
		scndhm.put(6, "Arya");
		scndhm.put(7, "Sethupathi");
		System.out.println(scndhm.put(7, "Sethupathi"));
		System.out.println(scndhm.put(7, "Sethupathi"));
		System.out.println("jgjgjk"+scndhm.put(7, "gdfsdfgfrgsd"));
		
		
		System.out.println("\nTwo HashSet into single HashSet");
		hm.putAll(scndhm);
		
		for(Map.Entry m:hm.entrySet() ){
			System.out.println(m.getKey()+" key its value "+m.getValue());
		}
		
		//remove(Key or Key,'Value') we can remove using Key or with Kay,value
		System.out.println("\nRemove HashSet - key (3) ");
		hm.remove(3);
		System.out.println("\nRemove HashSet - key(6) with value(Arya) ");
		hm.remove(6,"Arya");
		for(Map.Entry m:hm.entrySet() ){
			System.out.println(m.getKey()+" key its value "+m.getValue());
		}
		
		hm.clear();
		
		hm.put(1, "Pradeep");
		hm.put(2, "Vijay");
		hm.put(3, "Ajith");
		hm.put(4, "Surya");
		System.out.println("\nBefore replace display all -");
		for(Map.Entry m:hm.entrySet() ){
			System.out.println(m.getKey()+" key its value "+m.getValue());
		}
		//replace() , replace its value using ref. Key
		hm.replace(1, "DhaushPradeep");
		System.out.println("After replace(key , newvalue) -\n"+hm);
		
		hm.replace(3, "Ajith", "Vishal");
		System.out.println("\nAfter replace(key ,oldvalue ,newvalue) -\n"+hm);
		
		
		//compute(key ,Bifuntions) -The compute(Key, BiFunction) method of HashMap class allows 
		//you to update a value in HashMap.
		HashMap<Integer,String> act = new HashMap<Integer,String>();
		
		act.put(1, "Pradeep");
		act.put(2, "Vijay");
		act.put(3, "Ajith");
		act.put(4, "Surya");
	
		act.compute(1, (key,value) -> value.concat("Dhanush"));
		System.out.println("After compute key 1 - "+act.get(1));
		
		//computeIfAbsent - will put an key and value if not already present in HashSet
		act.computeIfAbsent(5, k -> "Pradeep");
		System.out.println("After computeIfAbsent - \n"+act.toString());
		
		//computeIfPresent - Will put an new value for alreay present Key
		act.computeIfPresent(1, (k,v) -> "Pradeep");
		System.out.println("After computeIfPresent - \n"+act.toString());
		
		//containsKey(Key)  containsValue(Value)
		HashMap<Integer,String> nm = new HashMap<Integer,String>();
		nm.put(1, "Pradeep");
		nm.put(2, "Vijay");
		nm.put(3, "Ajith");
		nm.put(4, "Surya");
		
		System.out.println("Check specific Key in hashmap - \n"+nm.containsKey(3));
		System.out.println("Check specific Value in hashmap - \n"+nm.containsValue("Vijay"));
		
		
		//Differnt types of implementation
		
		//immutable singleton  - we can create map only one node 
		Map<String,String> mpsimm = Collections.singletonMap("pradeep","dhanush");
		
		//Stream - with 2D string , we use Stream to store its key / values 
		//Collectors toMap converts stream to Map representation
		Map<String,String> mpstrm = Stream.of( new String[][] {
			{"Pradeep","one"},
			{"Hari","two"}
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.printf("Using Stream \n %s",mpstrm);
		
		Map<String,String> mpstrm2 = Stream.of( 
				new AbstractMap.SimpleEntry<>("Ravi", "tiruppur") 
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.printf("\nUsing AbstractMap.SimpleEntry \n %s",mpstrm2);
	
	}
	

}
