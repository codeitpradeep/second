package genCollection;

import java.util.*;
import java.util.stream.Collectors;

public class finddulpcte {
	
	public static void main(String[] args){
		
		ArrayList<String> ar = new ArrayList<String>(
				Arrays.asList("1","3","3","4","5","6","6"));
		
		//LinkedHashSet
		
		LinkedHashSet<String> lkhs = new LinkedHashSet<>();
		lkhs.addAll(ar);
		System.out.printf("%s \n",lkhs);
		
		List<String> ls = ar.stream().distinct().collect(Collectors.toList());
		System.out.printf("%s",ls);
	}

}
