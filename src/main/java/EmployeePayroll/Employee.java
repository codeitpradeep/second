package EmployeePayroll;

public abstract class Employee {
	private String firstname ;
	private String lastname ; 
	private String socialsecuritynumber ;
	
	public Employee(String firstname,String lastname, 
			String socialsecuritynumber){
		this.firstname = firstname;
		this.lastname = lastname;
		this.socialsecuritynumber = socialsecuritynumber;
	}
	
	public String getfirstname(){
		return firstname;
	}
	public String getlastname(){
		return lastname;		
	}
	
	public String getsocialsecuritynumber(){
		return socialsecuritynumber;		
	}
	
	public String toString(){
		return String.format("%s %s%nsocial security number:%s",
				getfirstname(),getlastname(),getsocialsecuritynumber());
	}
	public abstract	double earnings();
}
