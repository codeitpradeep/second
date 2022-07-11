package second;

class Test {
	public static int i = 0;

	Test() {
		i++;
	}

	public static int get() {
		return i;
	}

	public int m1() {
		System.out.println("Inside M1");
		this.m2();
		//m2();
		return 1;
	}

	public void m2() {
		System.out.println("Inside M2");
	}
}

public class constrtrclassinsdemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		int i = obj.m1();
		System.out.println("Here " + i);

		int no_of_objt = Test.get();
		System.out.println("Object - " + no_of_objt);
	}
}
//Inside M1
//Inside M2
//Here 1
//Object - 1
