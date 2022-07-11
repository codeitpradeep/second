package genCollection;

import java.util.*;
import java.util.LinkedList;


public class LinkedListpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> a=new LinkedList<String>(); 
		a.add("aaa");
		a.add("bbb");
		a.add("rrr");
		a.add("eee");
		
		//add(indexed location , "elements")
		a.add(3,"cccc");
		System.out.printf("Add / add(index based element)\n%s\n", a);
		System.out.printf("\n%s", "");
		
		//Access element based on index get(index)
		System.out.printf("Get element at Index[1] - %s\n", a.get(1));
		System.out.printf("\n%s", "");
		
		//set element using index / element 
		a.set(2, "zzzzz");
		System.out.printf("set new element at Index[2] - %s\n", a);
		System.out.printf("\n%s", "");
		
		//remove element at index 
		System.out.printf("Remove element at Index[3] - %s \n After removeing -%s\n",a.remove(3), a);
		System.out.printf("\n%s", "");
		
		//clear and make empty
		a.clear();
		//Java LinkedList as Queue
		//peek() poll() offer("element")
		a.add("aaa");
		a.add("bbb");
		a.add("rrr");
		a.add("eee");
		
		System.out.printf("Add \n%s\n", a);
		System.out.printf("\n%s", "");
		
		System.out.printf("peek will get head / first element \n %s \n %s \n", a.peek(),a);
		System.out.printf("\n%s", "");
		
		System.out.printf("poll will remove first element \n %s \n %s \n", a.poll(),a);
		System.out.printf("\n%s", "");
		
		System.out.printf("offer add at last index and place \n %b \n %s \n", a.offer("zzz"),a);
		System.out.printf("\n%s", "");
		
		a.clear();
		a.add("aaa");
		a.add("bbb");
		a.add("rrr");
		a.add("eee");
		
		//Java LinkedList as Deque 
		//add First Last get First Last remove First Last
		System.out.printf("Add \n%s\n", a);
		System.out.printf("\n%s", "");
		
		a.addFirst("yyyyy");
		a.addLast("rrrrr");
		System.out.printf("Add First index [%s] and Last index [%s] \n%s\n",
				a.indexOf("yyyyy"),a.indexOf("rrrrr"),a);
		System.out.printf("\n%s", "");
		
		System.out.printf("Get First Element [%s] and Last Element [%s] \n%s\n",
				a.getFirst(),a.getLast(),a);
		System.out.printf("\n%s", "");
		
		
		System.out.printf("Removed First Element [%s] and Last Element [%s] \n%s\n",
				a.removeFirst(),a.removeLast(),a);
		
	}

}
