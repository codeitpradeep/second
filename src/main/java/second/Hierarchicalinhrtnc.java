package second;
//When two or more classes inherits a single class, 
//it is known as Hierarchical inheritance.
class Annauniv{
	String gces = "Srirangam";
	String gct = "Coimbatore";
}

class Gces extends Annauniv{

	public void showaddress() {
		// TODO Auto-generated method stub
		System.out.println("Here 1--"+gces);
	}
	
}
class Gct extends Annauniv{

	public void showaddress() {
		// TODO Auto-generated method stub
		System.out.println("Here 2--"+gct);
	}
	
}

public class Hierarchicalinhrtnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gces clg1 = new Gces();
		Gct clg2 = new Gct();
		
		clg1.showaddress();
		clg2.showaddress();
		
	}
}
/*
Here 1--Srirangam
Here 2--Coimbatore
 */
