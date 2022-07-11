package second;
//Here overriding 
/*
 If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
 */

class Bank1{
	 int getintrestrate(){
		return 0;
	}
}

class Axix2 extends Bank1{
	 int getintrestrate(){
		return 9;
	}
}

class Sbi2 extends Bank1{
	 int getintrestrate(){
		return 6;
	}
}
public class overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axix2 axix = new Axix2();
		Sbi2 sbi = new Sbi2();
		
		axix.getintrestrate();
		sbi.getintrestrate();
	}
}
