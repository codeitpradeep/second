package finalkeywork;
/**
Let’s see how this principle applies to instance variables. Some of them need to be
modifiable and some do not. You can use the keyword final to specify that a variable is
not modifiable (i.e., it’s a constant) and that any attempt to modify it is an error. For
example
Declaring an instance variable as final helps enforce the principle of least privilege. If an
instance variable should not be modified, declare it to be final to prevent modification.
 the instance variables firstName, lastName, birthDate and
hireDate are never modified after they’re initialized, so they should be declared final 
 
d final to indicate that they cannot be modified after
 they’re initialized—such variables represent constant values 
 

 Final Methods Cannot Be Overridden
A final method in a superclass cannot be overridden in a subclass—this guarantees that
the final method implementation will be used by all direct and indirect subclasses in the
hierarchy. Methods that are declared private are implicitly final, because it’s not possible to override them in a subclass.

In the Java API, the vast majority of classes are not declared final. This enables
inheritance and polymorphism. However, in some cases, it’s important to declare classes
final—typically for security reasons. 

Final Classes Cannot Be Superclasses
A final class cannot extended to create a subclass. All methods in a final class are implicitly final. 
Class String is an example of a final class

 */

final class fnlclss{//A final class cannot extended to create a subclass
	
}

class A {
	final int a = 10;
	String c = "Fin";
	void show(){
		System.out.printf("A = %d\n",a);
		//a=a+1; Error :The final field A.a cannot be assigned
	}
	final void getting(){
		System.out.printf("%s \n","Final method");
		
		System.out.printf(c);
	}
}
class B extends A{
	
	void show(){
		int b =a ;
		System.out.printf("B = %d\n",b+1);
	}
	
	//final void getting(){ } Error: Cannot override the final method from A
}


public class finalkeywrkone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
		a.show();
		a.getting();
		
		fnlclss f= new fnlclss();
	}

}
