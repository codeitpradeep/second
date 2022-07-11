package BankingManagementSystem;

import java.util.Scanner;

public class Bankmenu {

	int menuchoose ;
	BaankingService bank=new BaankingService();
	public void showallmenu() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please choose Banking Service\n"
				+ "Enter 1 for Deposit\n"
				+"Enter 2 for Withdrawel\n"
				+"Enter 3 view Balanace"
				+"Enter 0 Exit\n");
		Scanner sc=new Scanner(System.in);
		menuchoose=sc.nextInt();
		//bank.getallbal();
		switch(menuchoose){
		case 1 : System.out.print("Here Deposit service\n");
		
		int amount = 0;
		amount = sc.nextInt();
		bank.deposit(amount);
		 showallmenu();
		break;
		case 2 : System.out.print("Here Withdrawel service\n");
		int Withdrawel = 0;
		Withdrawel = sc.nextInt();
		bank.Withdrawel(Withdrawel);
		 showallmenu();
		break;
		case 3 : System.out.print("Here Withdrawel service\n");
		bank.viewBal();
		 showallmenu();
		break;
		case 0: System.out.println("Thanks for Banking\n");
		}
		
		
	}

}
