package UpcastingDowncasting;

class Parent {
	Parent() {

	}
	void PrintData() {
		System.out.println("method of parent class");
	}
}

class Child extends Parent {
	Child() {

	}
	void PrintData() {
		System.out.println("method of child class");
	}
}

class Updwncsteg {
	public static void main(String args[]) {
		Parent obj1 = (Parent) new Child();
		Parent obj2 = (Parent) new Child();
		obj1.PrintData();
		obj2.PrintData();
		// down casting
		Parent p = new Child();

		Child c = (Child) p;
		c.PrintData();

	}
}

//method of child class
//method of child class
//method of child class
