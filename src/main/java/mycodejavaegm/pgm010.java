package mycodejavaegm;

// Find Larger number between 3 numbers if-else , Ternary opr 
public class pgm010 {

	public static void main(String[] args) {
		int a= 14 ,b =60 ,c=40;
		//Using if-else
		System.out.println("Using if-else");
		if(a>=b && a>=c){
			System.out.println("Bigger "+a);
		}else if(b>=a && b>=c){
			System.out.println("Bigger "+b);
		}else{
			System.out.println("Bigger "+c);
		}
		//Using Ternary opr
		System.out.println("Ternary opr");
		int r = c > (a>b ? a:b) ? c :(a>b ? a:b);
		System.out.println("Larger -"+r);
	}

}
/*
Using if-else
Bigger 60
Ternary opr
Larger -60
 */

