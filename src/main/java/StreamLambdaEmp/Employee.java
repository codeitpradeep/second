package StreamLambdaEmp;

public class Employee {
	
	private String name;
	private String Dept;
	private String Year;
	
	public Employee(String name,String Dept, String Year){
		this.name = name;
		this.Dept = Dept;
		this.Year = Year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
	
	
	

}
