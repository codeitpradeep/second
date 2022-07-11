package Abrstclsspgm;

public abstract class Drawart {
	public int length ;
	public int breath;
	Drawart(int i, int j){
		System.out.println("First constructor");
		length =i;
		breath =j;
	}
	
	public abstract void getdraw(); 
}


/*
Drawart - abstract class created with Constructor(Drawart(int i, int j){}) , with abstract method -( public abstract void getdraw(); )
Here we assign values to variables length =i; breath =j; from the subclasses Constructor's 
*/