package second;
//multilevel - When there is a chain of inheritance, it is known as multilevel inheritance.
class Homepage{
	String schoolname = "VVHMS";
	String board = "State Board";
	
	protected static int home(){
		int menu = 2;
		return menu;
	}
	
}
class About extends Homepage{
	String addrss = "Tiruppur ";
	String pincode = "641606";
	public void address(){
		System.out.println(" About page "+addrss+" "+pincode);
	}
}

class Collegeapp extends About{
	
	void showit(){
	System.out.println("Collegeapp page "+schoolname+" Board"+board+" Menus "+this.home());
	this.address();
	}
}

public class multilevelinhrtnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collegeapp clgap = new Collegeapp();
		
		clgap.showit();
		
	}

}
/*
Collegeapp page VVHMS BoardState Board Menus 2
 About page Tiruppur  641606

 */
