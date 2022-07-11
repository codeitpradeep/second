package BankingManagementSystem;
//initiate()  
public class BaankingService extends Loginuser {
	int retry = 3;
	public int bal ;
	public int amounthere;
	Loginuser login = new Loginuser();
	public void initiate(){
		
		
		for(int a=1;a<=retry;a++){
			System.out.println("Enter Valid details .. \n Retry count..."+a);
		try{
		login.getUserdetails();
		if(login.verfiydetails() == true){
			login.verfiydetails("Acc");
		}
		
		break ;
		}catch(Exception e){
			login.getUserdetails();
			if(login.verfiydetails() == true){
				login.verfiydetails("Acc");
			}
		}
		}
	}
	public void getallbal() {
		
		amounthere = login.getbalance();
		System.out.println("..."+amounthere);
	}
	public void deposit(int amount) {
		int newamnt = 0;
		
		System.out.println("..."+amounthere);
		newamnt = amount + login.getbalance();
		System.out.println("Amount added -"+newamnt);
		
		login.updatebalance(newamnt);
		System.out.println("Avaliable Bal -\n"+login.getbalance());
		
	}
	public void Withdrawel(int withdrawel) {
		int withdrawel1 = withdrawel;
		
		int withdrwlamnt = 0;
		if(login.getbalance() < withdrawel1){
			System.out.println("Avaliable Bal -\n"+login.getbalance()+"\n Enter Amount below Avaliable Balance");
		}else{
			withdrwlamnt =  login.getbalance() - withdrawel1;
			login.updatebalance(withdrwlamnt);
			System.out.println("Withdrawel-\n"+withdrwlamnt);
			System.out.println("Avaliable Bal after Withdrawel-\n"+login.getbalance());
		}
	}
	public void viewBal() {
		
		System.out.println("Avaliable Balance -\n"+login.getbalance());
	}
	

}
