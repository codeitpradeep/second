package dayone;

import java.util.Arrays;

import org.testng.annotations.Test;

public class agram {
	@Test
	void allnew() {
	String a = "Barg";
	String b = "Grab";

	a=a.toLowerCase();
	b=b.toLowerCase();

	char[] ar = a.toCharArray(); 
	char br[] = b.toCharArray(); 

	Arrays.sort(ar);
	Arrays.sort(br);
	 


	boolean get= Arrays.equals(ar,br)? true : false;

	System.out.println(get);
	}
}
