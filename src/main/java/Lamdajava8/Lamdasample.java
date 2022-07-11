package Lamdajava8;

interface Myfun {
	//void switchon();
	
	void Namesofani(String a);
}

class Getaccess implements Myfun {

	
	@Override
	public void Namesofani(String a) {
		System.out.println(a);
	}

}

public class Lamdasample {
	public static void main(String args[]) {
		// parameter exp methodbody
		//Myfun f = new Getaccess();
		//f.switchon();

		/*Myfun fun = () -> {
			// TODO Auto-generated method stub
			System.out.println("Hello");
		};*/
		//fun.switchon();
		
		Myfun fis = (s) -> {
			// TODO Auto-generated method stub
			System.out.println(s);
		};
		fis.Namesofani("Prad");

		Getaccess gc = new Getaccess();
		//gc.switchon();

	}

}
