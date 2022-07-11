package second;

class Subject{
	int rollno ;
	String name;
}

class Schoolstd extends Subject{
	
	void showdetails(String name,int idno){
		this.name = name;
		rollno = idno;
		System.out.println("Details -"+name+" "+rollno);
	}
}

public class prptyclassaccessinhrtnce {

	public static void main(String[] args) {
		// single Inheritance
		
		Schoolstd sdt = new Schoolstd();
		
		sdt.showdetails("Pradeep",101);
	}
}
/*
Details -Pradeep 101
 */
