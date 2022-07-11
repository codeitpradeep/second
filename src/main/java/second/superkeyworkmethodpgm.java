package second;
// Invoke method from super class 
//to sub class super.method();

class Banks {
	String name = "Super class";

	void showname() {
		System.out.println("1" + name);
	}
}
class Accountone extends Banks {
	void showname() {
		System.out.println("2" + name);
	}
	// Banks aSS = new Banks();
	public void showinsubclass() {
		// TODO Auto-generated method stub
		System.out.println("" + name);
		super.showname();
		showname();
	}
}
public class superkeyworkmethodpgm {

	public static void main(String[] args) {
		Accountone qccv = new Accountone();

		qccv.showinsubclass();
	}
}
//Super class
//1Super class
//2Super class
