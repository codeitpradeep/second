package mycodejavaegm;

//Swap interger using - temp value / add,sub operator.

public class pgm005 {

	public static void main(String[] args) {
		int a =4 ;
		int b =6 ;
		swapapprochone(a,b);
		swapapprochtwo(a,b);
	}

	public static void swapapprochtwo(int a, int b) {
		System.out.println("Approach 2-");
		a = a - b; //-2
		b = a + b; //4
		a = b - a; //6
		
		System.out.printf("Swap after - %d , %d \n" ,
				a ,b );
	}

	public static void swapapprochone(int a, int b) {
		System.out.printf("Swap before - %d , %d \n" ,
				a ,b );
		System.out.println("Approach 1-");
		int temp = 0;
		a = b;
		temp = b;
		a = temp;
		System.out.printf("Swap after - %d , %d \n" ,
				a ,b );
	}

}
/*
Swap before - 4 , 6 
Approach 1-
Swap after - 6 , 6 
Approach 2-
Swap after - 6 , 4 
 */

