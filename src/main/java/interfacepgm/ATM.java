package interfacepgm;

public interface ATM {
	
	void addamount(int amount);
	void getBalance();
	
	default int Atmcharge(int ipa){
		if(ipa == 1){
		ipa=5;
		}
		
		return ipa;
	}

}
