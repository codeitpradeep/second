package genCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name,stream,dept;
	public Student(String name, String stream, String dept) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.stream = stream;
		this.dept = dept;
	}
		
}


public class ListArrayListclasspgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("pradeep","BE","CSE");
		Student s2 = new Student("pradeep","BE","CSE");
		List<Student> ls = new ArrayList<Student>();
		
		ls.add(s1);
		ls.add(s2);
		System.out.println(ls.getClass());
		Iterator itr=ls.iterator(); 
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.name);
		}
	}

}
