package second;

// Constructor 
class Studentr {

	int id;
	String name;

	Studentr(int a, String b) {
		id = a;
		name = b;
	}

	public void showit() {
		// TODO Auto-generated method stub
		System.out.println("Here " + id + " " + name);
	}

}

public class constrtreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentr s1 = new Studentr(111, "Arnu");

		s1.showit();
	}

}
/*
 * Here 111 Arnu
 */
