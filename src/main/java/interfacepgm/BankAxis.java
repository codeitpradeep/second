package interfacepgm;

import java.util.HashMap;
import java.util.Map;

public class BankAxis extends Bankserver implements ATM , MobileBanking {
	
	int amt;
	public BankAxis(String accno, String pin) {
		super(accno,pin);
	
	}
	
	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		
		System.out.printf("Balance amount with intrest %d", amt);
		
	}

	@Override
	public void addamount(int amount) {
		// TODO Auto-generated method stub
		
		if(this.checkcus()){
			amt = amt+ amount + Atmcharge(1);
		}
		
	}

	@Override
	public void Upi(String upino) {
		// TODO Auto-generated method stub
		
	}


	
}
