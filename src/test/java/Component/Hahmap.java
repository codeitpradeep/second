package Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hahmap {

	
	//Input: hello world java
	
	private static void meth() {
		

	
	String word = "hello world java";
		String[] ref = word.split(" ");
		
		for(int i=0; i<ref.length; i++)
		{
			String rev = ref[i];
			char[] ch = rev.toCharArray();

			for(int j=ch.length-1; j>=0; j--)
			{
				System.out.print(ch[j]);				
			}
			System.out.print(" ");
		}
	

	}
		
	private static void dupe() {
		

	
		String s ="rajasekaranraana";
		List<Character> li = new ArrayList<Character>();
		for(int i=0;i<s.toCharArray().length;i++) {
			li.add(s.toCharArray()[i]);
		}
		//System.out.println(li);
		Set<Character> se= new LinkedHashSet<Character>(li);
		Iterator<Character> ite= se.iterator();
		
		while(ite.hasNext()) {
			Character check = ite.next();
			int frequency= Collections.frequency(li, check);
			if(frequency>1) {
				System.out.println(check+" "+frequency);
			}
		}
		
		
		/*
		 * char [] ch = s.toCharArray();
		 * 
		 * for(int i=0; i<ch.length; i++) { int count =0; for(int j=i+1; j<ch.length;
		 * j++) { if(ch[i]==ch[j]) { count++; ch[j]=0; }
		 * 
		 * 
		 * } if(count>0 && ch[i]!=0) System.out.print(ch[i]+" "+count);
		 * }System.out.println();
		 */
	}
	
	
	
	
	
	public static void main(String[] args) {
		//meth();
		dupe();	
				
	}




	private void tocharArray() {
		// TODO Auto-generated method stub
		
	}

}
