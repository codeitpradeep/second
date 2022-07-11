package Inheritanceexplm;

public class Bmwbrandcar extends Car {
	
	protected String carbranfinfo;
	public Bmwbrandcar(String speed, String gear, String applybreak , String carbranfinfo) {
		super(speed, gear, applybreak);
		// TODO Auto-generated constructor stub
		this.carbranfinfo = carbranfinfo;
		
	}
	
	public void getcarinfo(){
		System.out.printf("Get Information about car - \nSpeed - %s \nGear - %s \nBasic info -%s\n",speed,gear,carbranfinfo);
		
		System.out.printf("Apply break - %s\n",applybreak);
		
	}
	 

}
