package BankingManagementSystem;

import java.util.Scanner;

public class Loginuser {
	String username = "a";
	int password = 1;
	private int balance = 10000;
	String acc;
	int ps;
	
	void getUserdetails(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the username - ");
		acc = scanner.next();
		
		System.out.println("Enter the password - ");
		ps = scanner.nextInt();
		
	}
	 Boolean verfiydetails(){
		 Boolean status =false;
		if(username.equalsIgnoreCase(acc) && password == ps){
			System.out.println("Loginsuccess - Welcome to the bankservice");
			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			status = true;
		}
		return status;
	}
	 
	 void verfiydetails(String acc){
		
		 BaankingService bk = new BaankingService();
		
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			
			Bankmenu menu = new Bankmenu();
			menu.showallmenu();
		
	}
	int getbalance(){
		return balance;
		
	}
	public void updatebalance(int amount) {
		
		balance=amount;
	}
}
