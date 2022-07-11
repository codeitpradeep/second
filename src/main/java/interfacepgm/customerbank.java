package interfacepgm;

import java.util.*;

// interface ATM  ,   interface Mobilebank  , bank  , bankserver 



public class customerbank {

	public static void main(String[] args) {
		
		BankAxis as = new BankAxis("123456789","1901");
		
		Map<String,String> addmmber =new HashMap<String,String>();
		addmmber.put("113221111", "1332");
		addmmber.put("986511111", "1332");
		addmmber.put("123456789", "1901");
		
		as.setUsers(addmmber);
		as.addamount(10000);
		as.addamount(10000);
		as.getBalance();
	}

}
