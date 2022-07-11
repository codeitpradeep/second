package StreamLambdaEmp;

import java.util.*;

public class DataBaseLayer {
	
	public static List<Employee> getEmp(){
	
	List<Employee> list = new ArrayList<>();
	
	list.add(new Employee("pradeep", "CSE", "2018"));
	list.add(new Employee("vinoth", "IT", "2018"));
	list.add(new Employee("Dhanush", "CSE", "2019"));
	list.add(new Employee("Arun", "ECE", "2018"));
	return list;
	}
}
