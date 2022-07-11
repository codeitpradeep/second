package pgmString;

public class Stringupperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "asdasd";
		
		System.out.print(a.toUpperCase().toCharArray()[a.lastIndexOf("d")]);//D
		System.out.print(a.toUpperCase().toLowerCase().toCharArray()[a.lastIndexOf("d")]);//D
	}
//Dd
}
