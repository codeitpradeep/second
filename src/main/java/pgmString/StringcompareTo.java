package pgmString;

public class StringcompareTo {
	public static void main(String args[]){
		String a= "name";
		String b="Name";
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		
		String ab="b";
		String cd="c";
		System.out.println(ab.compareTo(cd));
	}
}
