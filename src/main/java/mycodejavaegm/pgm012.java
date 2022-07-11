package mycodejavaegm;

//Find factorial of number
public class pgm012 {
	private static  int getfact(int i) {
		// TODO Auto-generated method stub
		if(i==0){
			return 1;
		}
		return i*getfact(i-1);
	}
	public static void main(String[] args) {
		int i= 6;
		//recursive
		System.out.println("Fact of 14 -"+getfact(i));
		
		System.out.println("For using Fact");
		long fact = 1;
		int num = i;
		for(int m=1;m <= num; ++m){
			//fact = fact * m
			fact *= m;
					
		}
		System.out.println("//"+fact);
	}

	

}
/*
Fact of 14 -720
For using Fact
//720
 */

