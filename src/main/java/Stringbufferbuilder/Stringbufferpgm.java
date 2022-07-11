package Stringbufferbuilder;

public class Stringbufferpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbf = new StringBuilder("Pradeep"); 
		
		sbf.append("Dhanush");

		System.out.println(sbf);
		
		sbf.insert(1, "Auto");
		
		System.out.println(sbf);
		
		sbf.replace(0, 5, "ZerotoFive");
		
		System.out.println(sbf);
		
		sbf.delete(0, 5);

		System.out.println(sbf);
		
		sbf.reverse();
		
		System.out.println(sbf);
		
		
		System.out.println(sbf.substring(2));
	}

}


//PradeepDhanush
//PAutoradeepDhanush
//ZerotoFiveradeepDhanush
//oFiveradeepDhanush
//hsunahDpeedareviFo
//unahDpeedareviFo

