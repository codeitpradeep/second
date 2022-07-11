package second;

/*
 * Bank real time program 
 * Create acc.holder add money - deposit , check balance , credit from main acc , check balance 
 */

class Accountholder{
	int accno;
	String name;
	int mainbal;
	String bankname ;
	
	void createacc(int accno, String name,int mainbal, String bankname ){
		this.accno = accno  ;
		this.name = name ;
		this.mainbal = mainbal ;
		this.bankname = bankname;
		System.out.println("Account added "+ accno);
	}

	 

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Account "+ accno +" main bal "+ mainbal);
	}



	public void addmny(int newmony) {
		// TODO Auto-generated method stub
		
			mainbal = mainbal+ newmony;
			System.out.println("Deposit "+ accno +" main bal "+ mainbal);	
	}



	public void withdrw(int withdrw) {
		// TODO Auto-generated method stub
		mainbal = mainbal - withdrw;
		System.out.println("Cridet "+ accno +" main bal "+ mainbal);
	}
	
}


public class classobjectMethodeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accountholder acc = new Accountholder();
		
		acc.createacc(23321321, "Pradeep", 450000, "Axis");
		//acc.createacc(6321321, "Vinoth", 550000, "Axis");
		acc.show();
		acc.addmny(1000);
		acc.show();
		acc.withdrw(10000);
	}

}
/*
Account added 23321321
Account 23321321 main bal 450000
Deposit 23321321 main bal 451000
Account 23321321 main bal 451000
Cridet 23321321 main bal 441000 
*/