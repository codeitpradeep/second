package second;
// super - invoke the constructor

class Superclasswithconstrtr {
	public String name;

	Superclasswithconstrtr() {
		this.name = "Superclass";
		System.out.println("Constructor 1");
		System.out.println("1-" + name);
	}
}
class Subclasscallconstrtr extends Superclasswithconstrtr {
	void showconstrtr() {
		System.out.println("2-" + name);
	}
	Subclasscallconstrtr() {
		super();
		System.out.println("Constructor 2");
	}
	void showconstrtr1() {
		System.out.println("3-" + name);
	}
}
public class superkeyworkconstrustor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclasscallconstrtr str = new Subclasscallconstrtr();
		str.showconstrtr();
		str.showconstrtr1();
	}
}

//Constructor 1
//1-Superclass
//Constructor 2
//2-Superclass
//3-Superclass
