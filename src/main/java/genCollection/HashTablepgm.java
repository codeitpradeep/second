package genCollection;

import java.util.Hashtable;
import java.util.Map;


/**
The Hashtable class implements a hash table, which maps keys to values. 
Any non-null object can be used as a key or as a value. To successfully store 
and retrieve objects from a hashtable, the objects used as keys must implement 
the hashCode method and the equals method.  

Features of Hashtable

It is similar to HashMap, but is synchronized.
Hashtable stores key/value pair in hash table.
In Hashtable we specify an object that is used as a key, and the value we want 
to associate to that key. The key is then hashed, and the resulting hash code is 
used as the index at which the value is stored within the table.
The initial default capacity of Hashtable class is --11-- whereas loadFactor is 0.75.
HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast 
Enumeration.


It is possible that two unequal Objects have the same hashcode. 
This is called a collision. To resolve collisions, hashtable uses an array of lists.
 The pairs mapped to a single bucket (array index) are stored in a list and
  list reference is stored in the array index.


 */
public class HashTablepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> ht = new Hashtable<>();
		
		ht.put("one", "Pradeep");
		ht.put("two", "Vijay");
		ht.put("three", "Ajith");
		ht.put("four", "Surya");

		
		for(Map.Entry m:ht.entrySet() ){
			System.out.println(m.getKey()+"-"+m.getValue());
		}
		
//		two-Vijay
//		one-Pradeep
//		three-Ajith
//		four-Surya

		
		System.out.println("......");
		//compute
		//Returns:the new value associated with the specified key, or null if none
		ht.compute("AAA", (k,v) -> v="Pradeep");
		for(Map.Entry m:ht.entrySet() ){
			System.out.println(m);
		}
		System.out.println("......");
		//computeIfAbsent
		//Returns:the current (existing or computed) value associated withthe specified key, 
		//or null if the computed value is null
		ht.computeIfAbsent("CCCC", v -> v="four");
		for(Map.Entry m:ht.entrySet() ){
			System.out.println(m);
		}
		System.out.println("......");
		//computeIfPresent
		//Returns:the new value associated with the specified key, or null if none
		ht.computeIfPresent("CCCC", (k,v) -> v="ONE");
		for(Map.Entry m:ht.entrySet() ){
			System.out.println(m);
		}
		
		System.out.println(ht.get("one"));
	}

}
