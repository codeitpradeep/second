package second;

class Student{
	int rollnum;
	String name;
	// Write function to store value (class1 class2 )- Stack memory , data stored in heap memory
	void updatestudnts(int rollno,String names){
		rollnum= rollno;
		name = names;
	}
	
	void displayname(){
		System.out.println("Class "+ name + " and his rollnum is "+ rollnum);
	}
	
}

public class classandobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object using class name will writtern out side main class
		Student class1 = new Student();      
		Student class2 = new Student();
		
		// passing data using member function
		class1.updatestudnts(101,"Pradeep");
		class2.updatestudnts(102, "Vinoth");
		
		//Calling function to show result
		class1.displayname();
		class2.displayname();
	}

}
/*
Class Pradeep and his rollnum is 101
Class Vinoth and his rollnum is 102
 */
