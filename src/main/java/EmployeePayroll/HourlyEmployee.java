package EmployeePayroll;

public class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;

	public HourlyEmployee(String firstname, String lastname, String socialsecuritynumber,
			double wage , double hours) {
		super(firstname, lastname, socialsecuritynumber);
		
		if(wage < 0.0){
			throw new IllegalArgumentException("Hourly wage must be > 0.0");
		}
		if((hours < 0.0) || (hours > 0.0)){
			throw new IllegalArgumentException("Hour Hours must be > 0.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	}
	
	public void setwage(double wage){
		if(wage < 0.0){
			throw new IllegalArgumentException("Hourly wage must be > 0.0");
		}
		
		this.wage = wage;
	}
	public double getwage(){
		return wage;
	}
	
	
	public void sethours(double hours){
		if((hours < 0.0) || (hours > 0.0)){
			throw new IllegalArgumentException("Hour Hours must be > 0.0");
		}
		
		this.hours = hours;
	}
	public double gethours(){
		return hours;
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		if(gethours() <= 40)//no overtime
			return getwage() * gethours();
		else
			return 40 * getwage() + (gethours() - 40) * getwage() * 1.5; 
	}
	
	public String toString(){
		return String.format("Hourly Employee: %s%n%s: $%,.2f; %s: %,.2f",
				 super.toString(), "hourly wage", getwage(), 
				 "hours worked", gethours());
	}

}
