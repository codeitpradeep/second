package Inheritanceexplm;

public class Operationcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bmwbrandcar bc = new Bmwbrandcar("50","2nd","1","BMW Basic Car");
	
		bc.getcarinfo();
		
		System.out.printf("\nWe apply break for %s\n",bc.getApplybreak());
		bc.setApplybreak("3");
		
		bc.getcarinfo();
	
	}
}
