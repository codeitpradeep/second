package genCollection;

import java.util.TreeMap;


/**
 * Internal treeMap implementation
 					Orangr	
 				   /      \
  			   Banana	JackFruit
  			    /         /     \
  			Apple     carret   Tomato
  			
  			
 *
This will balanced according to Tree balancing
A Red-Black tree based NavigableMap implementation.
The map is sorted according to the naturalordering of its keys,
or by a Comparator provided at mapcreation time, depending on which constructor is used. 

This implementation provides guaranteed log(n) time cost for the 
containsKey, get, put and removeoperations. 

 */
public class Treemappgm {

	public static void main(String[] args) {
			TreeMap<String,Integer> tm =new TreeMap<>();
			tm.put("Orangr", 1);
			tm.put("Banana", 2);
			tm.put("Apple", 3);
			tm.put("JackFruit", 4);	
			tm.put("carret", 5);
			tm.put("Tomato", 6);
			
			System.out.println(tm);
	}

}
