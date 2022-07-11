package second;
//Here overriding 
/*
 If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
 */

class Bank{
	 int getintrestrate(){
		return 0;
	}
}

class Axix extends Bank{
	 int getintrestrate(){
		return 9;
	}
}

class Sbi extends Bank{
	 int getintrestrate(){
		return 6;
	}
}
public class multioverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axix axix = new Axix();
		Sbi sbi = new Sbi();
		
		
		axix.getintrestrate();
		sbi.getintrestrate();
		
		System.out.println("Bank Axis "+axix.getintrestrate());
		System.out.println("Bank SBI "+sbi.getintrestrate());
	}
}
/*
Bank Axis 9
Bank SBI 6
 */