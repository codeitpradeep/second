package interfacepgm;

import java.util.HashMap;
import java.util.Map;

public class Bankserver {
	
	private Map<String,String> users =new HashMap<String,String>();
	Boolean flag=false;
	
	String accno,pin;

	public Bankserver(String accno, String pin) {
		this.accno = accno ;
		this.pin = pin ;
	}


	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}
	
	boolean checkcus(){
		
		for(Map.Entry mp: getUsers().entrySet()){
			System.out.printf(" %s - %b \n",mp.getKey(),mp.getKey().equals(accno));
			if(mp.getKey().equals(accno)){
				if(mp.getValue().equals(pin)){
					flag= true;
				}
			}	
		}
		
		return flag;
	}

}
