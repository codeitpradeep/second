package pgmString;

public class StringInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sa = new String("pradeep");
		
		String sb = "pradeep";
		
		System.out.print(sb == sa.intern());

	}

}
