package EmployeePayroll;

//Here Employee(Abstract super class) 
public class SalariedEmployee extends Employee {
	
	private double weeklysalary;
	
	//While creating or extending Employee(Abstract super class)
	//default constructor need to implement,s , 
	// Here "super used to get properties from above extending Employee(Abstract super class) "
	public SalariedEmployee(String firstname, String lastname, String socialsecuritynumber ,double weeklysalary) {
		super(firstname, lastname, socialsecuritynumber);
		
		if(weeklysalary < 0.0){
			throw new IllegalArgumentException("weeklysalary must >= 0.0");
		}
		
		this.weeklysalary = weeklysalary;
		// TODO Auto-generated constructor stub
	}
	
	public void setweeklysalary(double weeklysalary) {
		if(weeklysalary < 0.0){
			throw new IllegalArgumentException("weeklysalary must >= 0.0");
		}
		
		this.weeklysalary = weeklysalary;
	}

	public double getweeklysalary(){
		return weeklysalary;		
	}
	
	//automatically method override , because we declare 'public abstract double earnings();'
	//in subclass we declare and we should use abstract - 'earnings()'
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getweeklysalary();
	}
	
	public String toString(){
		return String.format("Salaried Employee: %s%n%s: $%,.2f", super.toString()
				,"Weekly salary", getweeklysalary());
	}
	
}
