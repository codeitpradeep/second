package StreamLambdaEmp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Initclass {
	
	public static List<Employee> esitmate(){
		return DataBaseLayer.getEmp()
				.stream()
				.filter(t -> t.getName().equalsIgnoreCase("pradeep"))
				.collect(Collectors.toList());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(DataBaseLayer.getEmp());
		for(Employee s:DataBaseLayer.getEmp()) {
			//System.out.println(s.getName());
		}
		
		System.out.println(esitmate());
		
		for(Employee d:esitmate()) {
			System.out.println(d.getDept()+"-"+d.getName()+"-"+d.getYear());
		}
		
		

	}

}
