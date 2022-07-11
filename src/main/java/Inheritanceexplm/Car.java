package Inheritanceexplm;

public class Car {

	protected String speed;
	protected String gear;
	protected String applybreak;
	
	public Car(String speed,String gear,String applybreak){
		this.speed = speed ;
		this.gear = gear ;
		this.applybreak = applybreak ;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getApplybreak() {
		return applybreak;
	}

	public void setApplybreak(String applybreak) {
		this.applybreak = applybreak;
	}
	
	
}
