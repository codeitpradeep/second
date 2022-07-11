package day10;

import java.util.Arrays;

public class garam {
	public static void main(String args[]){
		String a1 = "grad",b1="radg";
		char[] a = new char[a1.length()];
		char[] b = new char[a1.length()];
		a=a1.toCharArray();
		b=b1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean bool = Arrays.equals(a,b) ? true:false ;
		
		if(bool){
			System.out.println("is ");
		}
		
	}
}
