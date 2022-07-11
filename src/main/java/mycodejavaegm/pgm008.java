package mycodejavaegm;

//Find ODD / EVEN integer 

public class pgm008 {

	public static void main(String[] args) {
		int a = 10 ;
		String s = ((a%2) == 0)? "Even":"ODD" ;
		System.out.println("Find 10 is -"+s);
		
		if(a%2 == 0){
			System.out.printf("Using bool %b",a%2 == 0);
		}
		
	}

}
/*
Find 10 is -Even
Using bool true
 */

