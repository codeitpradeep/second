package genCollection;

import java.util.*;

public class ListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Intro Arraylist Pgm--");
		pgone();
		
		System.out.println("--iterator() -  Arraylist Pgm--");
		pgtwo();
		System.out.println("--foreach to iterator  -  Arraylist Pgm--");
		pgthree();
		System.out.println("--get / set -Arraylist Pgm--");
		pgfour();
		System.out.println("--sort() -Arraylist Pgm--");
		pgfive();
		System.out.println("--addall() -Arraylist Pgm--");
		pgsix();
		System.out.println("--clear() -Arraylist Pgm--");
		pgseven();
		System.out.println("--clone() -Arraylist Pgm--");
		pgeight();
		System.out.println("--contains() -Arraylist Pgm--");
		pgnine();
		System.out.println("--indexOf() -Arraylist Pgm--");
		pgten();
		System.out.println("\n--removeAll() -Arraylist Pgm--");
		pgeleven();
		System.out.println("\n--remove() -Arraylist Pgm--");
		pgtwelve();
		System.out.println("\n--size() and isEmpty() -Arraylist Pgm--");
		pgthirteen();
		System.out.println("\n--subList() -Arraylist Pgm--");
		pgfourteen();
		System.out.println("\n--toArray() / toString -Arraylist Pgm--");
		pgfivteen();
		System.out.println("\n--lastIndexOf -Arraylist Pgm--");
		pgsixteen();
		System.out.println("\n--retainAll -Arraylist Pgm--");
		pgseventeen();
		System.out.println("\n--containsAll / toString -Arraylist Pgm--");
		pgeighteen();
		System.out.println("\n--trimtoSize / toString -Arraylist Pgm--");
		pgnineteen();
		System.out.println("\n--replaceAll / toString -Arraylist Pgm--");
		pgtwenty();
		System.out.println("\n--replaceeIF / toString -Arraylist Pgm--");
		pgtwentyone();
		
	}

	private static void pgtwentyone() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(); 
		a.add("Scotland");
		a.add("India");
		a.add("Iceland");
		a.add("England");
		//filter and remove elements using removeIf
		a.removeIf(e -> e.contains("land"));
		System.out.printf("removeIf 'land' filter element - %s " ,a);
	}

	private static void pgtwenty() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(Arrays.asList("1")); 
		a.add("bbb");
		a.add("zzz");
		a.add("ttt");
		a.add("www");
		// Java Lambda Expression. we operate list to make uppercase
		a.replaceAll(e -> e.toUpperCase());
		System.out.printf("replaceAll object element - %s " ,a);
		
	}

	private static void pgnineteen() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(); 
		a.add("bbb");
		a.add("zzz");
		a.add("ttt");
		a.add("www");
		//trimToSize used to trim unwanted size  
		((ArrayList<String>) a).trimToSize();
		System.out.printf("trimToSize object element - %s " ,a);
	}

	private static void pgeighteen() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(); 
		a.add("bbb");
		a.add("zzz");
		a.add("ttt");
		a.add("www");
		List<String> b=new ArrayList<String>(); 
		b.add("zzz");
		b.add("ttt");
		System.out.printf("containsAll() -Inside List 'a' contains all element from 'b' "
				+ " - %b \n" ,a.containsAll(b));
		
		System.out.printf("Suppose -Inside List 'b' contains all element from 'a' "
				+ " - %b\n " ,b.containsAll(a));
	}

	private static void pgseventeen() {
		// RetainAll - retain element common and same present between elements
		List<String> a=new ArrayList<String>(); 
		a.add("bbb");
		a.add("zzz");
		a.add("ttt");
		a.add("www");
		List<String> b=new ArrayList<String>(); 
		b.add("zzz");
		b.add("ttt");
		//Using retainAll we get unique elements
		a.retainAll(b);
		System.out.printf("retainAll object element unique - %s " ,a);
	}

	private static void pgsixteen() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(); 
		a.add("25");
		a.add("76");
		a.add("88");
		a.add("54");
		//return bool true if lastindex element present
		System.out.printf("LastIndex with parameter '54' %b " ,a.lastIndexOf("54"));
		
	}

	private static void pgfivteen() {
		// toArray()
		List<String> a=new ArrayList<String>(); 
		a.add("25");
		a.add("76");
		a.add("88");
		a.add("54");
				
		//One type to convert toArray() using 'String[] arr = new String[a.size()]'
		String[] arr = new String[a.size()];
		a.toArray(arr);
		System.out.println("toArray() with parameter");
		for(String s:arr){
			System.out.printf("%s \n",s);
		}
		//Another method toArray() without parameter 'Object[] e=a.toArray()'
		System.out.println("toArray() without parameter , create Object[]");
		Object[] e=a.toArray();
		for(Object obj:e){
			System.out.printf("%s \n",obj);
		}
		
		//toString()
		a.add("25");
		a.add("76");
		a.add("88");
		System.out.printf("%s \n","toString() used to convert lsit to String");
		String sa = a.toString();
		System.out.printf("%s \n",sa);
	}

	private static void pgfourteen() {
		// TODO Auto-generated method stub
		List<String> a=new ArrayList<String>(); 
		a.add("25");
		a.add("76");
		a.add("88");
		a.add("54");
		a.add("91");
		a.add("45");
		a.add("85");
		a.add("73");
		//Using sort to arrange list  
		Collections.sort(a);
		//Return SubList from hole element
		System.out.printf("\n subList() of the full list %s" , a.subList(3, a.size()));
		
	}

	private static void pgthirteen() {
		// size() -reutrn List size value  isEmpty() - return bool true/false
		List<String> a=new ArrayList<String>(); 
		a.add("Pradeep");
		a.add("vinoth");
		System.out.println("List Size -"+a.size());
		a.clear();
		System.out.println("List Size -"+a.size()+" IsEmpty bool -"+a.isEmpty());
		
	}

	private static void pgtwelve() {
		// remove(Object or index of element)
		List<String> a=new ArrayList<String>(); 
		a.add("Pradeep");
		a.add("vinoth");
		List<Integer> b=new ArrayList<Integer>(); 
		b.add(111);
		b.add(222);
		//remove(element Object) - element and reduce the List
		System.out.printf("Removed : %b and List reduced to - %s\n",a.remove("Pradeep"),a);
		a.add("Pradeep");
		a.add("vinoth");
		System.out.printf(" %s",a);
		//remove(index position)
		System.out.printf("Removed : %b removed by index - %s\n",a.remove(1),a);
		//Integer.valueOf(111) returns its
		System.out.printf(" %d \n ",Integer.valueOf(111));
		System.out.printf("Removed with Integer.valueOf(element) %b - %s\n",b.remove(Integer.valueOf(111)),b);
	}

	private static void pgeleven() {
		// removeAll()
		List<String> a=new ArrayList<String>(); 
		a.add("aaa");
		a.add("bbb");
		a.add("rrr");
		a.add("eee");
		List<String> b=new ArrayList<String>(); 
		b.add("rrr");
		b.add("aaa");
		//List to removeAll in list making list as Empty[]  
		a.removeAll(a);
		System.out.printf("RemoveAll to make List empty -%s\n",a);
		a.add("aaa");
		a.add("bbb");
		a.add("rrr");
		a.add("eee");
		//List to removeAll elements from another List 
		//same elements between to list will removeAll
		a.removeAll(b);
		System.out.printf("RemoveAll unique list will removed -%s",a);
		
	}

	private static void pgten() {
		// indexOf(Element) - returns the position , indexed ArrayList
		List<String> a=new ArrayList<String>(); 
		a.add("Pradeep");
		a.add("vinoth");
		List<Integer> b=new ArrayList<Integer>(); 
		b.add(111);
		b.add(222);
		//Based on wrapper Data type return index based on element
		System.out.printf("Wrapper String its index- %s \n "
				+ "Wrapper Integer its index- %d" , a.indexOf("Pradeep"),b.indexOf(222));
	}

	private static void pgnine() {
		// contains() find expected element inside Arraylist
		List<String> class1=new ArrayList<String>(); 
		class1.add("Pradeep");
		class1.add("vinoth");
		class1.add("Arun");
		class1.add("Ajith");
		List<String> class2=new ArrayList<String>(); 
		class2.add("Ajith");
		class2.add("Kumar");
		class2.add("Pradeep");
		class2.add("surya");
		
		for(String a:class1){
			//using contains() - bool check expected object inside list
			if(class2.toString().toLowerCase().contains(class1.get(class1.indexOf(a)).toString().toLowerCase())){
				System.out.println("same element compare and contains between list :\n"
						+class1.get(class1.indexOf(a)));
			}
		}
		
	}

	private static void pgeight() {
		// clone() - make a copy of same list 
		ArrayList<String> class1=new ArrayList<String>(); 
		class1.add("Pradeep");
		class1.add("vinoth");
		class1.add("Arun");
		class1.add("Bala");
		//clone() - makes copy of a list
		// (ArrayList<String>) - related to Typecasting manually convert into" (int)date" ;
		List<String> CSEStudent= (ArrayList<String>)class1.clone();
		
		System.out.printf("After clone() copy %s\n",CSEStudent);
	}

	private static void pgseven() {
		// clear() - remove all element inside list , make Empty []
		List<String> class1=new ArrayList<String>(); 
		class1.add("Pradeep");
		class1.add("vinoth");
		class1.add("Arun");
		class1.add("Bala");
		//clear() method access list,make Empty
		class1.clear();
		System.out.printf("clear() list %s\n",class1);
		//size() - retrieve list size
		System.out.printf("After clear() has %d size\n",class1.size());
	}

	private static void pgsix() {
		// addll() makes two list's to combine and display both in single link iteration 
		// addll() add all elements of collection ArrayList
		List<String> class1=new ArrayList<String>(); 
		class1.add("Pradeep");
		class1.add("vinoth");
		class1.add("Arun");
		class1.add("Bala");
		List<String> class2=new ArrayList<String>(); 
		class2.add("Ajith");
		class2.add("Kumar");
		class2.add("vijay");
		class2.add("surya");
		// addAll elements into single list
		// addaAll in class2 from (class1)
		class2.addAll(class1);
		System.out.println("Addall arraylist "+class2);
		for(String a:class2){
			 System.out.printf("%s[%d] \n",a,class2.indexOf(a));
		 }
		List<String> class3=new ArrayList<String>(); 
		class3.add("Pradeep");
		class3.add("vinoth");
		class3.add("Arun");
		class3.add("Bala");
		List<String> class4=new ArrayList<String>(); 
		class4.add("Ajith");
		class4.add("Kumar");
		class4.add("vijay");
		class4.add("surya");
		
		//AddAll(indextoadd,(ArrayList)) - we can add List at any index places 
		System.out.println("Addall(with index start , list) arraylist :");
		//addAll element with [index] start position , here we can all list inbetween to an Arraylist
		class4.addAll(1,class3);
		System.out.println("Addall arraylist "+class4);
		for(String a:class4){
			 System.out.printf("%s[%d] \n",a,class4.indexOf(a));
		 }
	}

	private static void pgfive() {
		//Collections.sort(ls); to sort default as ascending
		List<String> ls=new ArrayList<String>(); 
		 ls.add("Pradeep");
		 ls.add("vinoth");
		 ls.add("Arun");
		 ls.add("Bala");
		 System.out.printf("%s \n","Sorting an list in ArrayList");
		 
		 //Method one to sort from Collections.sort() class
		 Collections.sort(ls);
		 for(String a:ls){
			 System.out.printf("sort -%s[%d] \n",a,ls.indexOf(a));
		 }
		 
		 //method two to sort naturalOrder(ascending)  / reverseOrder(descending)
		 ls.sort(Comparator.reverseOrder());
		 System.out.printf("reverseOrder sort\n");
		 for(String a:ls){
			 System.out.printf("sort -%s[%d] \n",a,ls.indexOf(a));
		 }
		 ls.sort(Comparator.naturalOrder());
		 System.out.printf("naturalOrder(ascending) sort\n");
		 for(String a:ls){
			 System.out.printf("sort -%s[%d] \n",a,ls.indexOf(a));
		 }
	}

	private static void pgfour() {
		// get(index) / set(index,"elements")
		List<String> ls=new ArrayList<String>(); 
		 ls.add("Pradeep");
		 ls.add("vinoth");
		 ls.add("Arun");
		 ls.add("Bala");
		 
		 //Display individual "element" based in the index
		 //ArrayList - index based collection
		 System.out.printf("Index of Bala is %d \n "
		 		+"Index name at [2] is %s \n",ls.indexOf("Bala"),ls.get(2));
		 //set(index,"new element") - 
		 //setting element at the indexed place , existing index element will replaced to newElement
		 ls.set(2, "vijay");
		 System.out.printf("Index of Bala is %d \n "
			 		+"After using set(at index 2 as vijay)\nname at [2] is %s\n",ls.indexOf("Bala"),ls.get(2));
		 //Display Arraylist into for loop
		 for(String a:ls){
			 System.out.println(a);
		 }	 
	}

	private static void pgthree() {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>(); 
		 ls.add("Pradeep");
		 ls.add("vinoth");
		 ls.add("Arun");
		 ls.add("Bala");
		 // foreach will store collection on list
		 for(String a:ls){
			 System.out.println(a);
		 }
		 
	}

	private static void pgtwo() {
		//implementation of List with ArrayList
		List<String> ls=new ArrayList<String>(); 
		 ls.add("Pradeep");
		 ls.add("vinoth");
		 ls.add("Arun");
		 ls.add("Bala");
		 //Using iterator() -iterator all elements in list sequence
		 Iterator it =ls.iterator();
		 //Because of using iterator - we use hasNext() to return 
		 //bool if element linked to next element
		    while(it.hasNext()){
			{
				//Display list by using next in iterator()
				//next() method retrieve iterated elements
				System.out.println(it.next());
			}
		}
	}

	private static void pgone() {
		//Arraylist implements List interface .
		 List<String> ls=new ArrayList<String>(); 
		 //add new elements as String format
		 // We can add dynamic and duplicate elements 
		 //Add element based on Index
		 ls.add("Pradeep");
		 ls.add("vinoth");
		 ls.add("Arun");
		 ls.add("Bala");
		 //Display in the form of List
		 System.out.println(ls);
	}

}
