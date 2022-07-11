package genCollection;

import java.util.*;

public class Hashmapinternalworking {

	public static void main(String[] args) {
		
		//Internal basic work of Hashmap -
		//Contains hashcode with Key , java will automatically generate hash(1932134) number and ID to store in [16] memory
		// HashMap has [16] id's ie -16 Node 's
		Map<String,Integer> m = new HashMap<>();
		//put method will allocate its hashcode into its location ID's
		m.put("Array",100);
		m.put("String",200);
		m.put("Boolean",300);
		m.put("Class",400);
		
		//get method will search for its hashcode into the node , and display only the value
		System.out.printf("%s\n",m.get("Class"));
		for(Map.Entry mp:m.entrySet()){
			System.out.printf("%s",mp);
		}

	}

}
